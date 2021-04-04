class MemoryCalculation{
    
    public static void main(String args[]) {
        
		int number = Integer.parseInt(args[0]);
        if(number < 0)
        {
            System.out.println("There is no negative memory");
            System.exit(0);
        }
        
        switch(args[1])
        {
        case "kb":
        case "KB":    System.out.println("Memory in bytes: "+(number * Math.pow(2,10)));
                    break;
        case "mb":
        case "MB":    System.out.println("Memory in bytes: "+(number * Math.pow(2,20)));
                    break;
        case "gb":
        case "GB":    System.out.println("Memory in bytes: "+(number * Math.pow(2,30)));
                    break;
        case "tb":
        case "TB":    System.out.println("Memory in bytes: "+(number * Math.pow(2,40)));
                    break;
        default:     System.out.println("Wrong input");
                    break;
        }
    
    }

 

}