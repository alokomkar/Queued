package com.sortedqueue.practicecode_pro.base

/**
 * Created by Alok on 08/02/18.
 */
class DataManager {

    private val mChaptersList : ArrayList<Chapter> = ArrayList()

    init {
        var chapterIndex = 1
        var chapterId = "Chapter_" + chapterIndex++
        mChaptersList.add( Chapter( chapterId, LANGUAGE_JAVA, "Introduction", "Legend of Java" ))
        mChaptersList.add( Chapter( chapterId, LANGUAGE_JAVA, "Getting started", "Behold the mighty IDE" ))
        mChaptersList.add( Chapter( chapterId, LANGUAGE_JAVA, "Data Types", "Primitive ones vs Non primitive ones" ) )
        mChaptersList.add( Chapter( chapterId, LANGUAGE_JAVA, "Classes and Objects", "Creating objects by mapping real world information" ) )
    }

    fun fetchChaptersList() : ArrayList<Chapter> {
        return mChaptersList
    }

    fun fetchCodeBaseList( chapter: Chapter ) : ArrayList<CodeBase> {
        val codeBaseList = ArrayList<CodeBase>()
        var codeIndex = 1
        var codeBaseId = "CodeBase_" + codeIndex++
        codeBaseList.add( CodeBase(
                chapter.chapterId,
                codeBaseId,
                LANGUAGE_JAVA,
                "Syntax",
                "",
                "The syntax of Java is largely influenced by C++. Unlike C++, which combines the syntax for structured, generic, and object-oriented programming, Java was built almost exclusively as an object-oriented language. All code is written inside classes, and every data item is an object, with the exception of the primitive data types, (i.e. integers, floating-point numbers, boolean values, and characters), which are not objects for performance reasons. Java reuses some popular aspects of C++ (such as the printf method).\n" +
                        "\n" +
                        "Unlike C++, Java does not support operator overloading or multiple inheritance for classes, though multiple inheritance is supported for interfaces.\n" +
                        "\n" +
                        "Java uses comments similar to those of C++. There are three different styles of comments: a single line style marked with two slashes (//), a multiple line style opened with /* and closed with */, and the Javadoc commenting style opened with /** and closed with */. The Javadoc style of commenting allows the user to run the Javadoc executable to create documentation for the program and can be read by some integrated development environments (IDEs) such as Eclipse to allow developers to access documentation within the IDE.",
                "",
                "// This is an example of a single line comment using two slashes\n" +
                        "\n" +
                        "/* This is an example of a multiple line comment using the slash and asterisk.\n" +
                        " This type of comment can be used to hold a lot of information or deactivate\n" +
                        " code, but it is very important to remember to close the comment. */\n" +
                        "\n" +
                        "package fibsandlies;\n" +
                        "import java.util.HashMap;\n" +
                        "\n" +
                        "/**\n" +
                        " * This is an example of a Javadoc comment; Javadoc can compile documentation\n" +
                        " * from this text. Javadoc comments must immediately precede the class, method, or field being documented.\n" +
                        " */\n" +
                        "public class FibCalculator extends Fibonacci implements Calculator {\n" +
                        "    private static Map<Integer, Integer> memoized = new HashMap<Integer, Integer>();\n" +
                        "\n" +
                        "    /*\n" +
                        "     * The main method written as follows is used by the JVM as a starting point for the program.\n" +
                        "     */\n" +
                        "    public static void main(String[] args) {\n" +
                        "        memoized.put(1, 1);\n" +
                        "        memoized.put(2, 1);\n" +
                        "        System.out.println(fibonacci(12)); //Get the 12th Fibonacci number and print to console\n" +
                        "    }\n" +
                        "\n" +
                        "    /**\n" +
                        "     * An example of a method written in Java, wrapped in a class.\n" +
                        "     * Given a non-negative number FIBINDEX, returns\n" +
                        "     * the Nth Fibonacci number, where N equals FIBINDEX.\n" +
                        "     * @param fibIndex The index of the Fibonacci number\n" +
                        "     * @return The Fibonacci number\n" +
                        "     */\n" +
                        "    public static int fibonacci(int fibIndex) {\n" +
                        "        if (memoized.containsKey(fibIndex)) {\n" +
                        "            return memoized.get(fibIndex);\n" +
                        "        } else {\n" +
                        "            int answer = fibonacci(fibIndex - 1) + fibonacci(fibIndex - 2);\n" +
                        "            memoized.put(fibIndex, answer);\n" +
                        "            return answer;\n" +
                        "        }\n" +
                        "    }\n" +
                        "}", "", "", "", "", "", TYPE_NONE ))

        return codeBaseList
    }


}