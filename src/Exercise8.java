import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("0");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        int TestInteger;



        do {
            System.out.print("Height: ");
            TestInteger = in.nextInt();
        } while (TestInteger < 1 || TestInteger > 24);
        System.out.println();
        if(TestInteger==1){
            System.out.println("##");
        }
        if(TestInteger==2){
            System.out.println(" ##\n" +
                    "###");
        }
        if(TestInteger==3){
            System.out.println("  ##\n" +
                    " ###\n" +
                    "####");
        }
        if(TestInteger==4){
            System.out.println("   ##\n" +
                    "  ###\n" +
                    " ####\n" +
                    "#####\n");
        }
        if(TestInteger==5){
            System.out.println("    ##\n" +
                    "   ###\n" +
                    "  ####\n" +
                    " #####\n" +
                    "######");
        }
        if(TestInteger==6){
            System.out.println("     ##\n" +
                    "    ###\n" +
                    "   ####\n" +
                    "  #####\n" +
                    " ######\n" +
                    "#######");
        }
        if(TestInteger==7){
            System.out.println("      ##\n" +
                    "     ###\n" +
                    "    ####\n" +
                    "   #####\n" +
                    "  ######\n" +
                    " #######\n" +
                    "########");
        }
        if(TestInteger==8){
            System.out.println("       ##\n" +
                    "      ###\n" +
                    "     ####\n" +
                    "    #####\n" +
                    "   ######\n" +
                    "  #######\n" +
                    " ########\n" +
                    "#########");
        }
        if(TestInteger==9){
            System.out.println("        ##\n" +
                    "       ###\n" +
                    "      ####\n" +
                    "     #####\n" +
                    "    ######\n" +
                    "   #######\n" +
                    "  ########\n" +
                    " #########\n" +
                    "##########");
        }
        if(TestInteger==10){
            System.out.println("         ##\n" +
                    "        ###\n" +
                    "       ####\n" +
                    "      #####\n" +
                    "     ######\n" +
                    "    #######\n" +
                    "   ########\n" +
                    "  #########\n" +
                    " ##########\n" +
                    "###########");
        }
        if(TestInteger==11){
            System.out.println("          ##\n" +
                    "         ###\n" +
                    "        ####\n" +
                    "       #####\n" +
                    "      ######\n" +
                    "     #######\n" +
                    "    ########\n" +
                    "   #########\n" +
                    "  ##########\n" +
                    " ###########\n" +
                    "############");
        }
        if(TestInteger==12){
            System.out.println("           ##\n" +
                    "          ###\n" +
                    "         ####\n" +
                    "        #####\n" +
                    "       ######\n" +
                    "      #######\n" +
                    "     ########\n" +
                    "    #########\n" +
                    "   ##########\n" +
                    "  ###########\n" +
                    " ############\n" +
                    "#############");
        }
        if(TestInteger==13){
            System.out.println("            ##\n" +
                    "           ###\n" +
                    "          ####\n" +
                    "         #####\n" +
                    "        ######\n" +
                    "       #######\n" +
                    "      ########\n" +
                    "     #########\n" +
                    "    ##########\n" +
                    "   ###########\n" +
                    "  ############\n" +
                    " #############\n" +
                    "##############");
        }
        if(TestInteger==14){
            System.out.println("             ##\n" +
                    "            ###\n" +
                    "           ####\n" +
                    "          #####\n" +
                    "         ######\n" +
                    "        #######\n" +
                    "       ########\n" +
                    "      #########\n" +
                    "     ##########\n" +
                    "    ###########\n" +
                    "   ############\n" +
                    "  #############\n" +
                    " ##############\n" +
                    "###############");
        }
        if(TestInteger==15){
            System.out.println("              ##\n" +
                    "             ###\n" +
                    "            ####\n" +
                    "           #####\n" +
                    "          ######\n" +
                    "         #######\n" +
                    "        ########\n" +
                    "       #########\n" +
                    "      ##########\n" +
                    "     ###########\n" +
                    "    ############\n" +
                    "   #############\n" +
                    "  ##############\n" +
                    " ###############\n" +
                    "################");
        }
        if(TestInteger==16){
            System.out.println("               ##\n" +
                    "              ###\n" +
                    "             ####\n" +
                    "            #####\n" +
                    "           ######\n" +
                    "          #######\n" +
                    "         ########\n" +
                    "        #########\n" +
                    "       ##########\n" +
                    "      ###########\n" +
                    "     ############\n" +
                    "    #############\n" +
                    "   ##############\n" +
                    "  ###############\n" +
                    " ################\n" +
                    "#################");
        }
        if(TestInteger==17){
            System.out.println("                ##\n" +
                    "               ###\n" +
                    "              ####\n" +
                    "             #####\n" +
                    "            ######\n" +
                    "           #######\n" +
                    "          ########\n" +
                    "         #########\n" +
                    "        ##########\n" +
                    "       ###########\n" +
                    "      ############\n" +
                    "     #############\n" +
                    "    ##############\n" +
                    "   ###############\n" +
                    "  ################\n" +
                    " #################\n" +
                    "##################");
        }
        if(TestInteger==18){
            System.out.println("                 ##\n" +
                    "                ###\n" +
                    "               ####\n" +
                    "              #####\n" +
                    "             ######\n" +
                    "            #######\n" +
                    "           ########\n" +
                    "          #########\n" +
                    "         ##########\n" +
                    "        ###########\n" +
                    "       ############\n" +
                    "      #############\n" +
                    "     ##############\n" +
                    "    ###############\n" +
                    "   ################\n" +
                    "  #################\n" +
                    " ##################\n" +
                    "###################");
        }
        if(TestInteger==19){
            System.out.println("                  ##\n" +
                    "                 ###\n" +
                    "                ####\n" +
                    "               #####\n" +
                    "              ######\n" +
                    "             #######\n" +
                    "            ########\n" +
                    "           #########\n" +
                    "          ##########\n" +
                    "         ###########\n" +
                    "        ############\n" +
                    "       #############\n" +
                    "      ##############\n" +
                    "     ###############\n" +
                    "    ################\n" +
                    "   #################\n" +
                    "  ##################\n" +
                    " ###################\n" +
                    "####################");
        }
        if(TestInteger==20){
            System.out.println("                   ##\n" +
                    "                  ###\n" +
                    "                 ####\n" +
                    "                #####\n" +
                    "               ######\n" +
                    "              #######\n" +
                    "             ########\n" +
                    "            #########\n" +
                    "           ##########\n" +
                    "          ###########\n" +
                    "         ############\n" +
                    "        #############\n" +
                    "       ##############\n" +
                    "      ###############\n" +
                    "     ################\n" +
                    "    #################\n" +
                    "   ##################\n" +
                    "  ###################\n" +
                    " ####################\n" +
                    "#####################");
        }
        if(TestInteger==21){
            System.out.println("                    ##\n" +
                    "                   ###\n" +
                    "                  ####\n" +
                    "                 #####\n" +
                    "                ######\n" +
                    "               #######\n" +
                    "              ########\n" +
                    "             #########\n" +
                    "            ##########\n" +
                    "           ###########\n" +
                    "          ############\n" +
                    "         #############\n" +
                    "        ##############\n" +
                    "       ###############\n" +
                    "      ################\n" +
                    "     #################\n" +
                    "    ##################\n" +
                    "   ###################\n" +
                    "  ####################\n" +
                    " #####################\n" +
                    "######################");
        }
        if(TestInteger==22){
            System.out.println("                     ##\n" +
                    "                    ###\n" +
                    "                   ####\n" +
                    "                  #####\n" +
                    "                 ######\n" +
                    "                #######\n" +
                    "               ########\n" +
                    "              #########\n" +
                    "             ##########\n" +
                    "            ###########\n" +
                    "           ############\n" +
                    "          #############\n" +
                    "         ##############\n" +
                    "        ###############\n" +
                    "       ################\n" +
                    "      #################\n" +
                    "     ##################\n" +
                    "    ###################\n" +
                    "   ####################\n" +
                    "  #####################\n" +
                    " ######################\n" +
                    "#######################");
        }
        if(TestInteger==23){
            System.out.println("                      ##\n" +
                    "                     ###\n" +
                    "                    ####\n" +
                    "                   #####\n" +
                    "                  ######\n" +
                    "                 #######\n" +
                    "                ########\n" +
                    "               #########\n" +
                    "              ##########\n" +
                    "             ###########\n" +
                    "            ############\n" +
                    "           #############\n" +
                    "          ##############\n" +
                    "         ###############\n" +
                    "        ################\n" +
                    "       #################\n" +
                    "      ##################\n" +
                    "     ###################\n" +
                    "    ####################\n" +
                    "   #####################\n" +
                    "  ######################\n" +
                    " #######################\n" +
                    "########################");
        }
        if(TestInteger==24){
            System.out.println("                       ##\n" +
                    "                      ###\n" +
                    "                     ####\n" +
                    "                    #####\n" +
                    "                   ######\n" +
                    "                  #######\n" +
                    "                 ########\n" +
                    "                #########\n" +
                    "               ##########\n" +
                    "              ###########\n" +
                    "             ############\n" +
                    "            #############\n" +
                    "           ##############\n" +
                    "          ###############\n" +
                    "         ################\n" +
                    "        #################\n" +
                    "       ##################\n" +
                    "      ###################\n" +
                    "     ####################\n" +
                    "    #####################\n" +
                    "   ######################\n" +
                    "  #######################\n" +
                    " ########################\n" +
                    "#########################");
        }
    }
}