package core.http

class HttpException(val statusCode: Int, val errorMessage: String) : Exception(errorMessage)