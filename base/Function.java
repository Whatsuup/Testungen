package base;

public class Function
{
    //Variablen
    public int höhe, breite, länge;
    private String inputString = "";

    public Function() throws java.io.IOException
    {
        System.out.println("Programm startet...");
        input();
    }
    public void input() throws java.io.IOException
    {
        while (true)
        {
            int in = System.in.read();
            if (in == 10)
            {
                System.out.println(inputString);
                if (inputString.startsWith("length "))
                {
                    länge = Integer.parseInt(inputString.replace("l", ""));
                    länge = Integer.parseInt(inputString.replace("e", ""));
                    länge = Integer.parseInt(inputString.replace("n", ""));
                    länge = Integer.parseInt(inputString.replace("g", ""));
                    länge = Integer.parseInt(inputString.replace("t", ""));
                    länge = Integer.parseInt(inputString.replace("h", ""));
                    länge = Integer.parseInt(inputString.replace(" ", ""));
                    System.out.println("Länge: " +  länge);
                }
            } else {
                inputString += String.valueOf(Character.toChars(in));
            }
        }
    }

}
