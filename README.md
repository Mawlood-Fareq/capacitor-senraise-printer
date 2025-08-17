# Capacitor Senraise Printer

A Capacitor plugin for Senraise thermal printers. This plugin allows you to print text, barcodes, QR codes, and images from your Capacitor application to a connected Senraise printer.

## Supported Platforms

[![Android](https://img.shields.io/badge/Android-Supported-brightgreen.svg)](https://capacitorjs.com/docs/android)
[![iOS](https://img.shields.io/badge/iOS-Not%20Supported-red.svg)](https://capacitorjs.com/docs/ios)
[![Web](https://img.shields.io/badge/Web-Not%20Supported-red.svg)](https://capacitorjs.com/docs/web)

## Installation

```bash
npm install capacitor-senraise-printer
npx cap sync
```

## Usage Example

Here's an example of how to print a simple receipt:

```typescript
import { Printer } from 'capacitor-senraise-printer';

export class ReceiptPrinter {

  async printReceipt() {
    try {
      await Printer.setTextSize({ textSize: 28.0 });
      await Printer.setAlignment({ alignment: 1 }); // Center
      await Printer.setTextBold({ bold: true });
      await Printer.printText({ text: 'My Store\n' });

      await Printer.setTextSize({ textSize: 18.0 });
      await Printer.setAlignment({ alignment: 0 }); // Left
      await Printer.setTextBold({ bold: false });
      await Printer.printText({ text: '123 Main Street\n' });
      await Printer.printText({ text: 'Anytown, USA 12345\n\n' });

      await Printer.printTableText({
        text: ['Item', 'Qty', 'Price'],
        weight: [2, 1, 1],
        alignment: [0, 1, 2] // Left, Center, Right
      });
      await Printer.printTableText({
        text: ['----------------', '---', '-----'],
        weight: [2, 1, 1],
        alignment: [0, 1, 2]
      });
      await Printer.printTableText({
        text: ['Product 1', '1', '$10.00'],
        weight: [2, 1, 1],
        alignment: [0, 1, 2]
      });
      await Printer.printTableText({
        text: ['Product 2', '2', '$5.00'],
        weight: [2, 1, 1],
        alignment: [0, 1, 2]
      });
      await Printer.nextLine({line : 2});

      await Printer.setAlignment({ alignment: 1 }); // Center
      await Printer.printQRCode({
        data: 'https://your-website.com',
        modulesize: 8,
        errorlevel: 1
      });
      await Printer.nextLine({line : 4});

    } catch (error) {
      console.error('Error printing receipt:', error);
    }
  }
}
```

## API Reference

<details>
<summary><b>printEpson(options: { data: number[] })</b></summary>
<p>

Prints raw ESC/POS (Epson Standard Code) commands. This is useful for advanced printing tasks that are not covered by the other methods.

| Param      | Type       | Description                                                |
| :--------- | :--------- | :--------------------------------------------------------- |
| **`data`** | `number[]` | An array of byte values representing the ESC/POS commands. |

</p>
</details>

<details>
<summary><b>printText(options: { text: string })</b></summary>
<p>

Prints a string of text.

| Param      | Type     | Description                                |
| :--------- | :------- | :----------------------------------------- |
| **`text`** | `string` | The text to print. Use `\n` for new lines. |

</p>
</details>

<details>
<summary><b>printBarCode(options: { data: string, symbology: number, height: number, width: number })</b></summary>
<p>

Prints a barcode.

| Param       | Type     | Description                                                                                                              |
| :---------- | :------- | :----------------------------------------------------------------------------------------------------------------------- |
| `data`      | `string` | The barcode data.                                                                                                        |
| `symbology` | `number` | The barcode type. Common values include: `0` (UPC-A), `1` (UPC-E), `2` (EAN13), `3` (EAN8), `4` (CODE39), `8` (CODE128). |
| `height`    | `number` | The height of the barcode in dots.                                                                                       |
| `width`     | `number` | The width of the barcode. The value range is 1-4.                                                                        |

</p>
</details>

<details>
<summary><b>printQRCode(options: { data: string, modulesize: number, errorlevel: number })</b></summary>
<p>

Prints a QR code.

| Param        | Type     | Description                                                                  |
| :----------- | :------- | :--------------------------------------------------------------------------- |
| `data`       | `string` | The data to encode in the QR code.                                           |
| `modulesize` | `number` | The size of the QR code module (dot). The value range is 1-16.               |
| `errorlevel` | `number` | The error correction level. The value range is 0-3, representing L, M, Q, H. |

</p>
</details>

<details>
<summary><b>setAlignment(options: { alignment: number })</b></summary>
<p>

Sets the text alignment.

| Param       | Type     | Description                                                       |
| :---------- | :------- | :---------------------------------------------------------------- |
| `alignment` | `number` | The alignment style. `0` for left, `1` for center, `2` for right. |
</p>
</details>

<details>
<summary><b>setTextSize(options: { textSize: number })</b></summary>
<p>

Sets the text size.

| Param      | Type     | Description                                                          |
| :--------- | :------- | :------------------------------------------------------------------- |
| `textSize` | `number` | The size of the text, e.g., `18.0` for normal, `28.0` for large. |
</p>
</details>

<details>
<summary><b>setTextBold(options: { bold: boolean })</b></summary>
<p>

Sets the text to bold or normal.

| Param  | Type      | Description                               |
| :----- | :-------- | :---------------------------------------- |
| `bold` | `boolean` | `true` for bold text, `false` for normal. |

</p>
</details>

<details>
<summary><b>nextLine(options: { line: number })</b></summary>
<p>

Adds a specified number of empty lines.

| Param  | Type     | Description                               |
| :----- | :------- | :---------------------------------------- |
| `line` | `number` | The number of lines to feed.              |

</p>
</details>

## Platform Specific Configuration

### Android

No special permissions are required in your `AndroidManifest.xml` for this plugin to work.

## Contributing

Contributions to this Capacitor plugin are welcome! For major changes or new features, please open an issue first to discuss your ideas. Please note that this repository focuses on the plugin's integration and functionality, not modifications to the underlying Senraise SDK.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)