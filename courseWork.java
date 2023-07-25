import java.util.Scanner;
class courseWork{
    static Scanner input = new Scanner(System.in);
    static boolean log = false;
    static boolean log1 = false;
	static String pw = "";
	static String uname = "";
	static String nPw = "";
	static String pass = "";
	static String name = "";
	static String[][] userName =new String [1][2];
	static boolean sLogin1 = false;
	static boolean sLogin2 = false;
	static String[][] supplier=new String [1][2];
	static String[] itemC = new String [1];
	static String [][] adItem = new String[1][6];
	
	
	private final static void clearConsole(){
	
	
	
	final String os = System.getProperty("os.name");
		try {
			if (os.equals("Linux")) {
				System.out.print("\033\143");
			} else if (os.equals("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
	} catch (final Exception e) {
			System.err.println(e.getMessage());
	}
}

	public static void exitSystem(){
		System.exit(0);
	}

	public static void changetheCredentials(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tCREDENTIAL MANAGE\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
	
		L1: while (!sLogin1) {
            System.out.print("\nPlease Enter The User Name To Verify It's You : ");
            name = input.next();

              if (name.equals(userName[0][0])) {
				while(!sLogin2){  
				System.out.print("Enter Your Current Password : ");
				pass = input.next();
				 
			  if (pass.equals(userName[0][1])) {
                System.out.println();
                    break;  
            }
			
			else  {
                    System.out.println("invalid password. try again!");
                }
			}
				
             }	
            else {
                System.out.println("invalid username. try again!");
            }

            if(name.equals (userName[0][0])&&pass.equals(userName[0][1])){
				System.out.print("Enter your new password: ");
				nPw = input.next();
				userName[0][1] = nPw;
				
				System.out.print("Password changed successfully! Do you want to go home page (Y/N):");
				char op = input.next().charAt(0);
				
				if(op == 'Y' || op == 'y'){
					clearConsole();
					homePage();
				}
				else if(op == 'N'|| op == 'n'){
					clearConsole();
					System.exit(0);
				}
				else{
					clearConsole();
					System.exit(0);
				}
				break;
		}	
	}
}
	
    public static void main(String args[]) {

        loginPage();
		
    }

    public static void loginPage() {
 
        userName[0][0]="1";
        userName[0][1]="1";

        System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\t\tLOGIN PAGE\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		System.out.println();
		System.out.println();
		
      L1:  while (!log) {
            System.out.print("USERNAME : ");
            String uname = input.next();

            if (uname.equals(userName[0][0])) {

            while (!log1) {
				System.out.print("PASSWORD : ");
                String pw = input.next();
            if (pw.equals(userName[0][1])) {
                System.out.println("Login Successful!");
                  
            break L1;
            } 
            else {
            System.out.println("Password Is Invalid.Please Try Again!");
					}
                }
            } 
            else {
                System.out.println("Username Is Invalid.Please Try Again!");
            }
            if (uname.equals(userName[0][0]) && pass.equals(userName[0][1]) ) {
                break;
           }
		}
		clearConsole();
		homePage();
	}
	
	public static void homePage(){
		
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\tWELCOME TO IJSE STOCK MANAGEMENT SYSTEM\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		System.out.println();
		System.out.println();
		System.out.print("[1] change the Credentials");
		System.out.println("\t\t[2] Supplier Manage");
		System.out.print("[3] Stock Manage");
		System.out.println("\t\t\t[4] Log Out");
		System.out.println("[5] Exit The System");
		System.out.print("\nEnter an Opition to Continue > ");
		
		int opt = input.nextInt();
		
		if(opt==1){
			clearConsole();
			changetheCredentials();
			
		}
		else if(opt==4){
			clearConsole();
			loginPage();
		}	
		else if(opt==5)	{
			clearConsole();
			System.exit(0);
		}
		else if(opt==2){
			clearConsole();
			supplierManage();
		}
		else if(opt==3){
			clearConsole();
			stockManage();
		}
	
	}
	public static void supplierManage(){
		
		clearConsole();
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tSUPPLIER MANAGE\t\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		System.out.print("\n\n[1] Add Supplier");
		System.out.println("\t\t[2] Update Supplier");
		System.out.print("[3] Delete Supplier");
		System.out.println("\t\t[4] View Suppliers");
		System.out.print("[5] Search Supplier");
		System.out.println("\t\t[6] Home Page");	
		System.out.print("\nEnter An Option To Continue : ");
		
		int opo = input.nextInt();
			if(opo==1){
				clearConsole();
				addSupplier();
			}
			else if(opo==2){
				clearConsole();
				updateSupplier();
			}
			else if(opo==3){
				clearConsole();
				deleteSupplier();
			}
			else if(opo==4){
				clearConsole();
				viewSuppliers();
			}
			else if(opo==5){
				clearConsole();
				serchSupplier();
			}
			else{
				clearConsole();
				homePage();
			}
				
	}
	
	public static void addSupplier(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tADD SUPPLIER\t\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		
		String id="";

		L1: while (!log){
			System.out.print("\n\nSupplier Id : ");
			id = input.next();
			
			for (int i = 0; i < supplier.length; i++){
				if (id.equals(supplier[i][0])){
					System.out.println("Already Exsist..Try Another Supplier Id!");
					continue L1;
				}		
			}
			supplier[supplier.length-1][0]=id;
			System.out.print("Supplier Name : ");
			supplier[supplier.length-1][1] = input.next();
			System.out.println("\nAdded Successfully...");
			
			System.out.print("\nDo You Want Add Another Supplier(Y/N) : ");
		
		char op = input.next().charAt(0);
				
				if(op == 'Y' || op == 'y'){
					clearConsole();
					growSup();
					addSupplier();
					
				}
				else if(op == 'N'|| op == 'n'){
					clearConsole();
					supplierManage();
				}
				else{
					clearConsole();
					System.exit(0);
				}
		}				
}
	public static void growSup(){
		String tempSupplier [][]=new String[supplier.length+1][2];	
		for (int i = 0; i < supplier.length; i++){
			for (int j = 0; j < supplier[i].length; j++)
			{
			tempSupplier[i][j]=supplier[i][j];
			
			}	
		}

		supplier=tempSupplier;
		
	}
	
	public static void updateSupplier(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tUPDATE SUPPLIER\t\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		
		L1: while (true){
		System.out.print("\n\nSupplier Id : ");
		String id = input.next();
		boolean a =true;
		
		int k=0;
		
		for (int i = 0; i < supplier.length; i++){
			if(id.equals(supplier[i][0])){
				a=false;
				
				k=i;
				break;	
			}
		}
		if(a){
			System.out.println("Cant Find Supplier Id. Find Again....");
			continue L1;
		}
			System.out.println("\nSupplier Id   : " +supplier[k][0]);
			System.out.println("Supplier Name : " +supplier[k][1]);
			
			System.out.print("\nEnter New Supplier Name : ");
			supplier[k][1]=input.next();
			System.out.println("\nUpadeted Succesfully! do you want update an other supplier(Y/N)");
			
			char op = input.next().charAt(0);
				
				if(op == 'Y' || op == 'y'){
					clearConsole();
					updateSupplier();
				}
				else if(op == 'N'|| op == 'n'){
					clearConsole();
					supplierManage();
				}
				else{
					clearConsole();
					System.exit(0);
				}
}
}
	
	public static void deleteSupplier(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tDELETE SUPPLIER\t\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		
	L1: while (true){
			System.out.print("\n\nSupplier Id : ");
			String id = input.next();
			boolean a =true;
		
			int k=0;
		
			for (int i = 0; i < supplier.length; i++){
				if(id.equals(supplier[i][0])){
					a=false;
				
					k=i;
					break;	
				}
			}
			if(a){
				System.out.println("Cant Find Supplier Id! Find Again....");
				continue L1;
				
			}
			System.out.print("Supplier Id : "+supplier[k][0]);
		
			supplier = removeSupplier(k);
			
				System.out.println("Deleted Successfully");
				System.out.print("\nDo You Want Delete Another Supplier(Y/N) : ");
		
				char op = input.next().charAt(0);
				
					if(op == 'Y' || op == 'y'){
						clearConsole();
						deleteSupplier();
					}
					else if(op == 'N'|| op == 'n'){
						clearConsole();
						supplierManage();
					}
					else{
					clearConsole();
					System.exit(0);
				}
			}
		}

	
	public static void viewSuppliers(){
		

		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tVIEW SUPPLIERS\t\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		
		System.out.println("+-------------------+-------------------+");
		System.out.println("|   SUPPLIER ID     |    SUPPLIER NAME  |");
		System.out.println("+-------------------+-------------------+");
		
		for (int i = 0; i < supplier.length; i++){
			for (int j = 0; j < supplier[i].length; j++){
				
				System.out.printf("%-8s%-12s","|",supplier[i][j]);
				
			}
			System.out.println("|");
		}
		System.out.println("+-------------------+-------------------+");
		System.out.print("\nDo You Want Go Supplier Manage Page(Y/N) : ");
		
				char op = input.next().charAt(0);
				
				if(op == 'Y' || op == 'y'){
					clearConsole();
					supplierManage();
				}
				else if(op == 'N'|| op == 'n'){
					clearConsole();
					System.exit(0);
				}
				else{
					clearConsole();
					System.exit(0);
				}
	}
	
	public static void serchSupplier(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tSEARCH SUPPLIER\t\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
	L1:	while (true){
		System.out.print("\nSupplier Id   : ");    
	    String id = input.next();
	    
	    boolean a = false;
	    
	    int val = 0;
	    for (int i = 0; i < supplier.length; i++){
			if(id.equals(supplier[i][0])){
				val = i;
				a = true;
				break;
			}
		
		}
		if(a==false){
			System.out.println("Can't Find Supplier Id! Try again...");
			continue L1;
	    }	
	    	System.out.println("Supplier Name : "+supplier[val][1]);
	    	System.out.println("Added Successfully! DO You Want Added Anther Find(Y/N) : ");
	    	
	    	char op = input.next().charAt(0);
				
					if(op == 'Y' || op == 'y'){
						clearConsole();
						serchSupplier();
					}
					else if(op == 'N'|| op == 'n'){
						clearConsole();
						supplierManage();
					}
					else{
					clearConsole();
					System.exit(0);
					}
		}
	}	
	
	public static String[][] removeSupplier(int k){
		
		String [][] temp = new String[supplier.length-1][2];
	
	L1:	for (int i = 0,a=0; i < supplier.length; i++){
			for (int j = 0; j < supplier[i].length; j++){
				if(i==k){
					continue L1;
				}
				temp[a][j]=supplier[i][j];
				a++;
			}

		}
			return temp;	
		
	}
	
	public static void stockManage(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tSTOCK MANAGEMENT\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		System.out.print("\n\n[1] Manage Item Categories");
		System.out.println("\t\t[2] Add Item");
		System.out.print("[3] Get Items Supplier Wise");
		System.out.println("\t\t[4] View Items");
		System.out.print("[5] Rank Items Per Unit Price");
		System.out.println("\t\t[6] Home Page");	
		System.out.print("\nEnter An Option To Continue : ");
		
		int opo = input.nextInt();
			if(opo==1){
				clearConsole();
				manageItem();
			}
			else if(opo==2){
				clearConsole();
				addItem();
			}
			else if(opo==6){
				clearConsole();
				homePage();
			}
			else if(opo==3){
				clearConsole();
				getItemssup();
			}
			else if(opo==4){
				clearConsole();
				viewItem();
			}
			else{
				clearConsole();
				rankUnit();
			}
						
		
	}
	
	public static void manageItem(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tMANAGE ITEM CATEGORY\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		System.out.print("\n\n[1] Add New Item Category");
		System.out.println("\t\t[2] Delete Item Category");
		System.out.print("[3] Update Item Category");
		System.out.println("\t\t[4] Stock Management");
		System.out.print("\nEnter An Option To Continue : ");
		
		int opo = input.nextInt();
			if(opo==1){
				clearConsole();
				addIc();
			}
			else if(opo==2){
				clearConsole();
				deleteItem();
			}
			else if(opo==3){
				clearConsole();
				updateItem();
			}
			else if(opo==4){
				clearConsole();
				stockManage();
			}
		
	}
	
	public static void addIc(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tADD ITEM CATEGORY\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
	if(itemC.length == 0)itemC = growIc();
		
	L1 : while (true){
			
		System.out.print("\nAdd The New Item Category : ");
		String item = input.next();
		
		for (int i = 0; i < itemC.length; i++){
			if(item.equals(itemC[i])){
				System.out.println("Already Exist! Try Another Category....");
				continue L1;
			}
		}
		itemC[itemC.length-1]=item;	

		System.out.print("Added Successfully! DO You Want To Add Another Category(Y/N) : ");
		char op = input.next().charAt(0);
				
					if(op == 'Y' || op == 'y'){
						clearConsole();
						itemC=growIc();
						addIc();
					}
					else if(op == 'N'|| op == 'n'){
						clearConsole();
						manageItem();
					}
					else{
					clearConsole();
					System.exit(0);
				}
		}
	
		
	}
	
	public static void deleteItem(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tDELETE ITEM CATEGORY\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		
		L2: while (true){
			System.out.print("\nItem Category : ");
			String item = input.next();
			
			boolean a = false;
			int value = 0;
			
			for (int i = 0; i < itemC.length ; i++){
				if(item.equals(itemC[i])){
					value = i;
					a =true;
					break;
				}
			
				
			}
			
			if(a==false){
				System.out.println("Cant Find Item Category! Please Try Again....");
				continue L2;
			}
			itemC = removeIc(value);
			System.out.println("Delete Succesfully! Do You Want To Delete Another Item Category...(Y/N)");
			
			char op = input.next().charAt(0);
				
					if(op == 'Y' || op == 'y'){
						clearConsole();
						deleteItem();
					}
					else if(op == 'N'|| op == 'n'){
						clearConsole();
						manageItem();
						break;
					
				}
				else{
					clearConsole();
					System.exit(0);
				}
		}
}
	
	
	public static String[] removeIc(int value){
		
		String [] temp = new String [itemC.length-1];
		
	L1:	for (int i = 0,j=0; i < itemC.length; i++){
			if(i==value){
				continue L1;
			}
			temp[j]=itemC[i];
			j++;
		}
		return temp;
}		
	public static void updateItem(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tUPDATE ITEM CATEGORY\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		L1: while (true) {
			System.out.print("\nCategory Name: ");
			String category = input.next();
			boolean a = false;

        for (int i = 0; i <=itemC.length; i++) {
			if (category.equals(itemC[i])) {
				System.out.print("\nEnter the new Item Category: ");
				String name = input.next();
				itemC[i] = name;
				a = true;
				break;
			}
		}

        if (!a) {
        System.out.println("Can't find category, please try again!");
        	continue L1;
        }

			System.out.print("Updated Successfully! Do you want to update another item category? (Y/N)");
			char opt = input.next().charAt(0);

			if (opt == 'N' || opt == 'n') {
				clearConsole();
				stockManage();
				break;
			} 
			else if (opt == 'Y' ||opt == 'y') {
				clearConsole();
				itemC = growIc();
				updateItem();
        
			}
			else{
					clearConsole();
					System.exit(0);
				}
        
			deleteSupplier();
        }
	}

	public static String[] growIc(){
		
		String [] temp = new String [itemC.length+1];
		for (int i = 0; i <itemC.length ; i++){
			temp[i]=itemC[i];
		}
		return temp;
		
		
	}
	
	public static void addItem(){
	   
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|                              ADD ITEM                             |");
				System.out.println("+-------------------------------------------------------------------+");
	    
	    
	    
	    if (null == itemC[0]){
			System.out.println("\nOOPS! It seems that you don't have any item categories in the system.");
			System.out.print("Do you want to add a new item category?(Y/N) ");
			char opt = input.next().charAt(0);
			if (opt == 'Y' || opt == 'y') {
				clearConsole();
				addIc();
			}
			if (opt == 'N' || opt == 'n') {
				clearConsole();
				System.exit(0);
			}
			else {
				clearConsole();
				System.exit(0);
			}
		}
		if (null == supplier[0][0]){
			System.out.println("\nOOPS! It seems that you don't have any suppliers in the system.");
			System.out.print("Do you want to add a new supplier?(Y/N) ");
			char opt = input.next().charAt(0);
			if (opt == 'Y' || opt == 'y') {
				clearConsole();
				addSupplier();         
			}
			if (opt == 'N' || opt == 'n') {
				clearConsole();
				stockManage();
			}
			else {
				clearConsole();
				System.exit(0);
			}
		}
		int i = 0;
		
   L4: while(true) {
			System.out.print("\nItem Code  : ");
			String itemInput = input.next();
			for (int a = 0; a < adItem.length; a++) {
				if (itemInput.equals(adItem[a][1])) {
					System.out.println("already exists. try another Item Code!");
					
					continue L4;
				}
			}
			
			adItem[i][1] = itemInput;
				
			System.out.println("\nSuppliers list:");
			System.out.println("+-------------+-------------------+-------------------+");
			System.out.println("|      #      |    SUPPLIER ID    |   SUPPLIER NAME   |");
			System.out.println("+-------------+-------------------+-------------------+");
			for (int l = 0; l < supplier.length; l++) {
				System.out.printf("%-7s%-7d","|",(l+1));
				for (int j = 0; j < supplier[l].length; j++) {
					System.out.printf("%-8s%-12s","|",supplier[l][j]);
				}
				System.out.println("|");
			}
			System.out.println("+-------------+-------------------+-------------------+");
	L5:	while (true) {
				System.out.print("\nEnter the supplier number > ");
				int n = input.nextInt();
				boolean num = true;
				for (int y = 0; y < supplier.length; y++) {
					if ((n - 1) == y) {
						adItem[i][0] = supplier[y][0];
						num = false;
						break L5;
					}
				}
				if (num) {
					System.out.println("Invalid number. Try again!");
					continue L5;
				}
			}
			System.out.println("\nItem Categories:");
			System.out.println("+-----------+--------------------------+");
			System.out.println("|     #     |      CATEGORY NAME       |");
			System.out.println("+-----------+--------------------------+");
			for (int q = 0; q < itemC.length; q++){
				System.out.printf("%-6s%-6d%-9s%-18s%s","|",(q+1),"|",itemC[q],"|");
				System.out.println();
			}
			System.out.println("+-----------+--------------------------+");
	L3:	while (true) {
				System.out.print("\nEnter the category number > ");
				int n1 = input.nextInt();
				boolean num1 = true;
				for (int c = 0; c < itemC.length; c++) {
					if ((n1 -1) == c) {
						adItem[i][5] = itemC[c];
						num1 = false;
						break L3;
					}
				}
				if (num1) {
					System.out.println("Invalid number. Try again!");
					continue L3;
				}
			}
			System.out.print("\nDescription  : ");
			adItem[i][2] = input.next();
			System.out.print("Unit price   : ");
			adItem[i][3] = input.next();
			System.out.print("\nQty on hand  : ");
			adItem[i][4] = input.next();
			System.out.print("added successfully! Do you want to add another Item(Y/N)? ");
			char add = input.next().charAt(0);
			if (add == 'Y' || add == 'y') {
				adItem = growItem();
				i++;
				clearConsole();
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|                              ADD ITEM                             |");
				System.out.println("+-------------------------------------------------------------------+");
				continue L4;    
			}
			if (add == 'N' || add == 'n') {
				clearConsole();
				stockManage();
			}
			else {
				clearConsole();
				System.exit(0);
			}
		}
		
		}
		
		public static String[][] growItem(){
			String [][] temp1 = new String [adItem.length+1][6];
			for (int i = 0; i < adItem.length; i++){
				for (int j = 0; j < adItem[i].length; j++){
					temp1[i][j]=adItem[i][j];
					
				}
				
			}
			 return temp1;
		}
		public static void getItemssup(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tSEARCH SUPPLIER\t\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		L1:	while (true){
			System.out.print("\nEnter Supplier Id : ");
			String id = input.next();
			
			boolean a = false;
			int value = 0;
			
			for (int i = 0; i < supplier.length; i++){
				if (id.equals(supplier[i][0])){
					value=i;
					a = true;
					break;
				}
			}
				if(a==false){
					System.out.println("Can't Find Supplier Id!Please Try Again....");
					continue L1;
				}
				System.out.println("Supplier Name : "+supplier[value][1]);
				
				System.out.println("Suplier's List");
				System.out.println("+-------------------+-------------------+-------------------+-------------------+-------------------+");
				System.out.println("|   ITEM CODE       |   DESCRIPTTION    |   UNIT PRICE      |   QTY ON HAND     |    CATEGORY	    |");
				System.out.println("+-------------------+-------------------+-------------------+-------------------+-------------------+");
				
				for (int j = 0; j < adItem.length; j++){
					for (int k = 0; k <adItem[j].length; k++){
						if (k!=0) System.out.printf("%-8s%-12s","|",adItem[j][k]);	
						
					}
					
					System.out.println("|");
					
				}
				System.out.println("+-------------------+-------------------+-------------------+-------------------+-------------------+");
				System.out.print("Search Successfully! Do You Want ANother Search?(Y/N)");
				
				char opt = input.next().charAt(0);
			if (opt == 'Y' || opt == 'y') {
				clearConsole();
				getItemssup();         
			}
			if (opt == 'N' || opt == 'n') {
				clearConsole();
				stockManage();
			}
			else {
				clearConsole();
				System.exit(0);
			}
	
			}
			
		}
		public static void viewItem(){
		
				System.out.println("+-------------------------------------------------------------------+");
				System.out.printf("%-29s%-39s%s","|","VIEW ITEMS","|\n");
				System.out.println("+-------------------------------------------------------------------+");
				
	
			for (int i = 0; i <itemC.length; i++){
		
				System.out.println(itemC[i]);
			
				System.out.println("+------------+------------+------------+------------+------------+");
				System.out.println("|   SID      |   CODE     |   DESC     |  PRICE     |  QTY       |");
				System.out.println("+------------+------------+------------+------------+------------+");
			for (int l = 0; l < adItem.length; l++) {

				for (int j = 0; j < adItem[l].length; j++) {
					if(j!=5)System.out.printf("%-5s%-8s","|",adItem[l][j]);
				}
				System.out.println("|");
			}
				System.out.println("+------------+------------+------------+------------+------------+");
		
			System.out.println("Do you want to go stock manage page? (Y/N)");
			char opt = input.next().charAt(0);
			
			if(opt == 'Y' || opt == 'y'){
				clearConsole();
				stockManage();
			}
			
			else if(opt == 'N' || opt == 'n'){
				clearConsole();
				homePage();
			}
		}
	}
	
	public static void rankUnit(){
		
		System.out.println("+-----------------------------------------------------------------------+");
        System.out.print("|\t\t\tRANK UNIT PRICE\t\t\t\t\t|");
        System.out.println("\n+-----------------------------------------------------------------------+");
		
		for (int i = 0; i <adItem.length-1; i++){
			for (int j = 0; j<adItem.length-1;j++){
				if(Double.parseDouble(adItem[j][3]) >Double.parseDouble(adItem[j+1][3])){
				
				String [] temp= adItem[j];
				adItem[j] = adItem[j+1];
				adItem[j+1] = temp;
				}
			}			
		}
		
		System.out.println("+-------------+-------------+-------------+-------------+-------------+-------------+");
		System.out.println("|    SID      |    CODE     |    DESC     |   PRICE     |    QTY      |    CAT      |");
		System.out.println("+-------------+-------------+-------------+-------------+-------------+-------------+");
			
		for (int k = 0; k < adItem.length; k++){
			for (int l = 0; l <adItem[k].length ; l++){
				System.out.printf("%-5s%-9s","|",adItem[k][l]);
			}	
			System.out.println("|");
		}
		
		System.out.println("+-------------+-------------+-------------+-------------+-------------+-------------+");
		System.out.print("Do You Want To Go To Stock Manage Page(Y/N) : ");
		
		char opt = input.next().charAt(0);
			if (opt == 'Y' || opt == 'y') {
				clearConsole();
				stockManage();
			}
			if (opt == 'N' || opt == 'n') {
				clearConsole();
				homePage();
			}
			else {
				clearConsole();
				System.exit(0);
			}
	}
}	
		
