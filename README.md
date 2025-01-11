# Kotlin NullPointerException in map function with nullable types

This code demonstrates a common error when using the `map` function in Kotlin with nullable types.  The `map` function throws a `NullPointerException` if it encounters a `null` value. This example shows how to correctly handle nullable types within a `map` operation.

## Bug Description
The `map` function expects non-nullable types.  If a `null` value is encountered, the function will throw a `NullPointerException`.  The provided example shows this scenario and its resolution using `?.let` and `mapNotNull`.

## Solution
The solution uses `?.let` to handle null values and `mapNotNull` to filter out nulls.  Both approaches correctly handle potential null values in the list.