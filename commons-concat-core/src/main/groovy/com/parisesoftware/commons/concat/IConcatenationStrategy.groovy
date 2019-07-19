package com.parisesoftware.commons.concat

/**
 * Concatenation Strategy
 *
 * <p>
 * Encapsulation for an interchangeable concatenation algorithm
 *
 * @version 1.0
 * @since 1.0
 */
interface IConcatenationStrategy {

    /**
     * Concatenate the given strings together
     * @version 1.0
     * @param aFirstValue
     * @param aSecondValue
     * @since 1.0
     * @return {@code String} the Concatenation Resultant
     */
    String concatenate(String aFirstValue, String aSecondValue)

}
