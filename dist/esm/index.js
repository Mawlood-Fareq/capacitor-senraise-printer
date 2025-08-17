import { registerPlugin } from '@capacitor/core';
const Printer = registerPlugin('Printer', {
    web: () => import('./web').then(m => new m.PrinterWeb()),
});
export * from './definitions';
export { Printer };
//# sourceMappingURL=index.js.map