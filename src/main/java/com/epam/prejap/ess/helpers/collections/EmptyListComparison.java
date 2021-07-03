package com.epam.prejap.ess.helpers.collections;

import java.util.Collections;
import java.util.List;

/**
 * Comparison of Collections.emptyList with Collections.EMPTY_LIST.
 * <p>
 * Both comes from the {@link Collections} class, which was introduced in Java 1.2
 * <p>
 * @author Michal Majewski
 * @version 0.2
 * @see Collections
 **/
class EmptyListComparison {

    /**
     * Introduced in Java 1.2 <br>
     * <br>
     * The private static final field in the Collections class.
     * The constant is initialized only once and reference to the raw type List.
     * It is initialized by "new EmptyList", which is an inner class in the Collections class.<br>
     * <br>
     * The return list is always:
     * <ul>
     *      <li>raw type</li>
     *      <li>an empty list</li>
     *      <li>an immutable collection</li>
     *      <li>serializable</li>
     * </ul>
     * Assigning a raw type to a generic one is not type safe, and will generate a warning,
     * so it's not recommended to use since the emptyList() was introduced in Java 1.5
     * @see <a href="https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Collections.html#EMPTY_LIST">Java SE 16 & JDK 16 - EMPTY_LIST</a>
     **/
    private final List EMPTY_LIST = Collections.EMPTY_LIST;

    public static void main(String[] args) {



    }

    /**
     * Introduced in Java 1.5 <br>
     * <br>
     * Along with introduced generics, the emptyList() was added to the Collections class.
     * The method returns a generic list. Under the hood uses type-inference,
     * and returns the EMPTY_LIST which is explicitly cast into List {@literal <T>} type. <br>
     * <br>
     * The return list is always:
     * <ul>
     *      <li>generic type</li>
     *      <li>an empty list</li>
     *      <li>an immutable collection</li>
     *      <li>serializable</li>
     * </ul>
     * Implementations of this method need not create a separate List object for each call.
     * Every call of this method return a cast reference from the EMPTY_LIST field.
     * Using this method is likely to have comparable cost to using the like-named field.
     * (Unlike this method, the field does not provide type safety.)
     * <br>
     * Since then it is recommended way to obtain an empty list.
     * @see <a href="https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Collections.html#emptyList()">Java SE 16 & JDK 16 - emptyList()</a>
     **/
    private <T> List<T> emptyList() {
        return Collections.emptyList();
    }
}
