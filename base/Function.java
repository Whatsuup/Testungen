package base;

public class Function
{
    //Variablen
    public int höhe = 0, breite = 0 , länge = 0;
    private String inputString = "";

    public Function() throws java.io.IOException
    {
        System.out.println("Folgende Befehle werden akzeptiert:");
        System.out.println("   - length + Länge des Quaders");
        System.out.println("   - width + Breite des Quaders");
        System.out.println("   - height + Länge des Quaders");
        System.out.println("   - calc + Gib das Volumen aus");
        input();
    }
    public void input() throws java.io.IOException
    {
        while (true)
        {
            int in = System.in.read();
            if (in == 10)
            {
                if (inputString.startsWith("length "))
                {
                    inputString = inputString.replace("l", "");
                    inputString = inputString.replace("e", "");
                    inputString = inputString.replace("n", "");
                    inputString = inputString.replace("g", "");
                    inputString = inputString.replace("t", "");
                    inputString = inputString.replace("h", "");
                    inputString = inputString.replace(" ", "");
                    länge = Integer.parseInt(inputString);
                    System.out.println("Länge: " +  länge);
                }
                if (inputString.startsWith("width "))
                {
                    inputString = inputString.replace("w", "");
                    inputString = inputString.replace("i", "");
                    inputString = inputString.replace("d", "");
                    inputString = inputString.replace("t", "");
                    inputString = inputString.replace("h", "");
                    inputString = inputString.replace(" ", "");
                    breite = Integer.parseInt(inputString);
                    System.out.println("Breite: " +  breite);
                }
                if (inputString.startsWith("height "))
                {
                    inputString = inputString.replace("h", "");
                    inputString = inputString.replace("e", "");
                    inputString = inputString.replace("i", "");
                    inputString = inputString.replace("g", "");
                    inputString = inputString.replace("t", "");
                    inputString = inputString.replace("h", "");
                    inputString = inputString.replace(" ", "");
                    höhe = Integer.parseInt(inputString);
                    System.out.println("Höhe: " +  höhe);
                }
                if (inputString.startsWith("calc"))
                {
                    System.out.println("Volumen: " +  breite * länge * höhe + "cm³");
                }
                inputString = "";
            } else {
                inputString += String.valueOf(Character.toChars(in));
            }
        }
    }

}
