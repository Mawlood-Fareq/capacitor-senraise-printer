export interface PrinterStatus { status: string }

export interface PrinterPlugin {

  connect(): Promise<void>;
  printEpson(options: { data: number[] }): Promise<void>;
  printText(options: { text: string }): Promise<void>;
  printBarCode(options: { data: string, symbology: number, height: number, width: number }): Promise<void>;
  printQRCode(options: { data: string, modulesize: number, errorlevel: number }): Promise<void>;
  setAlignment(options: { alignment: number }): Promise<void>;
  setTextSize(options: { textSize: number }): Promise<void>;
  nextLine(options: { line: number }): Promise<void>;
  printTableText(options: { text: string[], weight: number[], alignment: number[] }): Promise<void>;
  setTextBold(options: { bold: boolean }): Promise<void>;
  printBASE64PNG(options: { pic: string }): Promise<void>;

}