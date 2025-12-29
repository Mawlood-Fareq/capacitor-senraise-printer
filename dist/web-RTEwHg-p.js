import { W as WebPlugin } from './index-BtYMP1wm.js';

class PrinterWeb extends WebPlugin {
    async checkStatus() {
        return Promise.resolve({ isConnected: false });
    }
    async start() {
        throw this.unimplemented('Not implemented on web.');
    }
    async stop() {
        throw this.unimplemented('Not implemented on web.');
    }
    async connect() {
        throw this.unimplemented('Not implemented on web.');
    }
    async disconnect() {
        throw this.unimplemented('Not implemented on web.');
    }
    async printEpson(options) {
        console.log('printEpson', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async printText(options) {
        console.log('printText', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async printBarCode(options) {
        console.log('printBarCode', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async printQRCode(options) {
        console.log('printQRCode', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async setAlignment(options) {
        console.log('setAlignment', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async setTextSize(options) {
        console.log('setTextSize', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async nextLine(options) {
        console.log('nextLine', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async printTableText(options) {
        console.log('printTableText', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async setTextBold(options) {
        console.log('setTextBold', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async setDark(options) {
        console.log('setDark', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async setLineHeight(options) {
        console.log('setLineHeight', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async setTextDoubleWidth(options) {
        console.log('setTextDoubleWidth', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async setTextDoubleHeight(options) {
        console.log('setTextDoubleHeight', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async printBASE64PNG(options) {
        console.log('printBASE64PNG', options);
        throw this.unimplemented('Not implemented on web.');
    }
    async test() {
        throw this.unimplemented('Not implemented on web.');
    }
}

export { PrinterWeb };
//# sourceMappingURL=web-RTEwHg-p.js.map
