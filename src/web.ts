import { WebPlugin } from '@capacitor/core';

import type { PrinterPlugin } from './definitions';

export class PrinterWeb extends WebPlugin implements PrinterPlugin {
  async printEpson(options: { data: number[] }): Promise<void> {
    console.log('printEpson', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async printText(options: { text: string }): Promise<void> {
    console.log('printText', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async printBarCode(options: { data: string, symbology: number, height: number, width: number }): Promise<void> {
    console.log('printBarCode', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async printQRCode(options: { data: string, modulesize: number, errorlevel: number }): Promise<void> {
    console.log('printQRCode', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async setAlignment(options: { alignment: number }): Promise<void> {
    console.log('setAlignment', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async setTextSize(options: { textSize: number }): Promise<void> {
    console.log('setTextSize', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async nextLine(options: { line: number }): Promise<void> {
    console.log('nextLine', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async printTableText(options: { text: string[], weight: number[], alignment: number[] }): Promise<void> {
    console.log('printTableText', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async setTextBold(options: { bold: boolean }): Promise<void> {
    console.log('setTextBold', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async setDark(options: { value: number }): Promise<void> {
    console.log('setDark', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async setLineHeight(options: { lineHeight: number }): Promise<void> {
    console.log('setLineHeight', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async setTextDoubleWidth(options: { enable: boolean }): Promise<void> {
    console.log('setTextDoubleWidth', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async setTextDoubleHeight(options: { enable: boolean }): Promise<void> {
    console.log('setTextDoubleHeight', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async printBASE64PNG(options: { pic: string }): Promise<void> {
    console.log('printBASE64PNG', options);
    throw this.unimplemented('Not implemented on web.');
  }

  async test(): Promise<void> {
    throw this.unimplemented('Not implemented on web.');
  }
}
