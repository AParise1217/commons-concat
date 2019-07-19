package com.parisesoftware.commons.concat

import com.parisesoftware.commons.concat.impl.DashConcatenationStrategy
import com.parisesoftware.commons.concat.impl.OnlySecondConcatenationStrategy

/**
 * Concatenation Strategy
 * <p>
 * Family of Interchangeable String Concatenation Algorithms
 *
 * @version 1.0
 * @since 1.0
 *
 * @see {@link IConcatenationStrategy} for a type-safe delegation
 */
class ConcatenationClosure {

    /**
     * Concatenates two Strings with a Dash between them
     * @version 1.0
     * @since 1.0
     */
    static final Closure DASH = { String value1, String value2 ->
        new DashConcatenationStrategy().concatenate(value1, value2)
    }

    /**
     * Returns only the Second Value
     * @version 1.0
     * @since 1.0
     */
    static final Closure ONLY_SECOND = { String value1, String value2 ->
        new OnlySecondConcatenationStrategy().concatenate(value1, value2)
    }

}
