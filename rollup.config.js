import resolve from '@rollup/plugin-node-resolve';
import commonjs from '@rollup/plugin-commonjs';

export default {
  input: 'dist/esm/index.js',
  output: {
    dir: 'dist',
    format: 'es',
    name: 'capacitorPlugin',
    globals: {
      '@capacitor/core': 'capacitorExports',
    },
    sourcemap: true,
  },
  plugins: [
    resolve(),
    commonjs(),
  ],
};
