import { expect, test } from 'vitest';
import { sum } from './math';

test(`can add two numbers`, () => {
    const result: number = sum(1, 2);

    expect(result).toBe(3);
});

test(`test that fails`, () => {
    expect(false).toBe(true);
});
