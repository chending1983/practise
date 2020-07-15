package com.cl.elena.pattern.Behavioral.Chain;

public class ChainPatternDemo {

	public ChainPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static AbstractLogger setErrorLogChain() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = setErrorLogChain();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

	}

}
