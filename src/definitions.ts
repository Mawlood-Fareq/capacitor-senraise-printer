import type { PluginListenerHandle } from '@capacitor/core';

export interface PrinterStatus { status: string }

export interface PrinterPlugin {
  checkStatus(): Promise<{ isConnected: boolean }>;
  start(): Promise<void>;
  stop(): Promise<void>;
  connect(): Promise<void>;
  disconnect(): Promise<void>;
  printEpson(options: { data: number[] }): Promise<void>;
  printText(options: { text: string }): Promise<void>;
  printBarCode(options: { data: string, symbology: number, height: number, width: number }): Promise<void>;
  printQRCode(options: { data: string, modulesize: number, errorlevel: number }): Promise<void>;
  setAlignment(options: { alignment: number }): Promise<void>;
  setTextSize(options: { textSize: number }): Promise<void>;
  nextLine(options: { line: number }): Promise<void>;
  printTableText(options: { text: string[], weight: number[], alignment: number[] }): Promise<void>;
  setTextBold(options: { bold: boolean }): Promise<void>;
  setDark(options: { value: number }): Promise<void>;
  setLineHeight(options: { lineHeight: number }): Promise<void>;
  setTextDoubleWidth(options: { enable: boolean }): Promise<void>;
  setTextDoubleHeight(options: { enable: boolean }): Promise<void>;
  printBASE64PNG(options: { pic: string }): Promise<void>;
  test(): Promise<void>;

  addListener(
    eventName: 'printerStatus',
    listenerFunc: (status: PrinterStatus) => void,
  ): Promise<PluginListenerHandle>;
}