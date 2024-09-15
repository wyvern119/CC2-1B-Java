public class PadillaConsoleBasedInvoice {
    public static void main(String[] args){

        //1. Store Information

        //This is the name and address of the store
        System.out.print("\t\"Manette's Agricultural and Poultry Supply\" \nMacArthur Highway, San Nicolas, Villasis, Pangasinan");
        /*
        I used the print command instead of the println command.
        I could've used both, but I did it to use both escape sequences for formatting.
        */

        //2. Itemized List

        //This is where I put the feeds purchased and their individual prices
        System.out.println("\n\n1 k \t\tCrack Corn: \t\t₱32/kilo \t\t₱32");
        System.out.println("2 k \t\tCorn Grits: \t\t₱33/kilo \t\t₱66");
        System.out.println("5 k \t\tGMP 2: \t\t\t\t₱41/kilo \t\t₱205");

        //This is where I put the fertilizers purchased and their individual prices
        System.out.println("1 bag \t\tUrea Swire \t\t\t₱1520 \t\t\t₱1520");
        System.out.println("1 bag \t\tMB Sulfate \t\t\t₱800 \t\t\t₱800");

        //This is where I put the herbicide and molluscicide purchased and their individual prices
        System.out.println("1 sach \t\tSurekill \t\t\t₱100 \t\t\t₱100");
        System.out.println("1 bot \t\t2-4D Ester 1L \t\t₱300 \t\t\t₱300");

        /*
        The itemized list is where I "abused" both the escape sequences.
        It does look messy, but the output format looks really neat and clean.
         */

        //3. Total Amount

        //This is where I put the total cost of all the purchases
        System.out.print("\n\t\t\t\t\t\t\t\t Total Cost: ");
        System.out.println("\t₱3023");
        /*
        I also abused the /t command on this one too.
        I used both print commands per the instruction
         */

        //4. Additional Notes

        //This is put the additional note
        System.out.println("\t\t\t\t\tThank You!");
        /*
        I added a "!" to add a little emotion :D
        Centered the note with a lot of tab escape sequences
         */
    }
}

/*
Personal Message:
All the prices and products added in the invoice are all real products
being sold in our neat little shop in Pangasinan, so that's one fun fact.
I didn't know that I would miss being a cashier, but maybe it's homesickness.
 */