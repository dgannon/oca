class InitBlockExample{
    InitBlockExample() {
        System.out.println("InitializerBlockExample:constructor");
    }
    {
        System.out.println("InitializerBlockExample:initializer");
    }
}

class InitializerBlockExample{
    public static void main(String[] args){
        InitBlockExample x = new InitBlockExample();
    }
}
