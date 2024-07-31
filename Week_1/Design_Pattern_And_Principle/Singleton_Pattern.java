
class Logger {
	    private static Logger instance;

	    private Logger() {
	    }

	    public static Logger getInstance() {
	        if (instance == null) {
	            instance = new Logger();
	        }
	        return instance;
	    }

	    // Method to log messages
	    public void log(String message) {
	        System.out.println("Log: " + message);
	    }
	}

 class Singleton_Pattern {
		
	
	    public static void main(String[] args) {
	        Logger logger1 = Logger.getInstance();
	        Logger logger2 = Logger.getInstance();

	        // Test if both logger1 and logger2 are the same instance
	        if (logger1 == logger2) {
	            System.out.println("Both logger1 and logger2 are the same instance");
	        } else {
	            System.out.println("logger1 and logger2 are different instances");
	        }

	        // Log messages
	        logger1.log("This is the first log message.");
	        logger2.log("This is the second log message.");
	    }
	}

