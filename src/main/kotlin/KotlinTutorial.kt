fun main() {
    val exampleString = "\"Florian\nWalther\""
    val exampleRawString = """ "Florian 
        Walther" """
    print(exampleRawString)

    val exampleNumber: Double
    exampleNumber = 2_000_000.12
    val exampleLong: Long = exampleNumber.toLong()
    val exampleFloat: Float = 28.3F

    val exampleByte: Byte = 127
    val exampleShort: Short = 363
    val exampleChar = '?'
    val exampleInt: Int = exampleChar.toInt()
    val exampleBoolean = false;
}