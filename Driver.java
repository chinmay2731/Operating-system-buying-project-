package main_folder;

import java.util.Scanner;
import java.util.ArrayList;



interface er {
	void register();

	void email();

	void user();

	void pnum();

	void pass();

	void login();

	void demo();
}

 class info implements er {
	static String name1;
	private String email_id;
	private String phone1;
	private String username1;
	private String password1;
	private String password2;
	private String username;
	private String password;
	
	public String getEmail_id()
	{
		return email_id;
	}
	public String setEmail_id(String email_id)
	{
		return email_id;
		
	}
	public String getPhone1()
	{
		return phone1;
		
	}
	public String setPhone1(String phone1)
	{
		return phone1;
	}
	
	public String getUsername1()
	{
		return username1;
	}
	
	public String setUsername1()
	{
		return username1;
	}
	
	public String getPassword1()
	{
		return password1;
	}
	
	public String setPassword1(String password1)
	{
		return password1;
	}
	public String getPassword2()
	{
		return password2;
	}
	
	public String setpassword2(String password2)
	{
		return password2;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String setUsername(String username)
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	 
	public String setPassword(String password)
	{
		return password;
	}
	
	
	
	
	ArrayList<String> name = new ArrayList<String>();
	
	Scanner s = new Scanner(System.in);// Scanner
	

	public void register() // register
	{
		System.out.println("\n\n|==============================================|\n"
				+ "|             REGISTRATION PAGE                |\n"
				+ "|==============================================|");

		System.out.print("\n\nEnter name:");// username:user
		name1 = s.next();
		name.add(name1);

	}

	public void email() {
		System.out.print("\n\nEnter Email Id:-");// Email ID
		email_id = s.next();
		name.add(email_id);
	}

	public void pnum() // Phone Number
	{
		System.out.print("\n\nEnter phone:-");
		phone1 = s.next();
		name.add(phone1);
		
		if (phone1.length()==10)
		{
			
		}
		else {
		System.out.println("Enter Re-Enter Phone no.");
		pnum();
		}
		
	}

	public void user() {
		System.out.println("\n\nCreate 6 to 10 length username\n\n");
		System.out.print("Create New username:-");// username:user
		username1 = s.next();
		name.add(username1);

		if (username1.length() >= 6 && username1.length() <= 10) {

		} else {
			System.out.println("Enter Username");
			user();
		}
	}

	public void pass() {
		System.out.println("\n\nCreate 6 to 20 length password");

		System.out.print("\n\nCreate New passeword:-");// password:user
		password1 = s.next();
		name.add(password1);

		if (password1.length() >= 6 && password1.length() <= 20) {
			System.out.println("");
		} else {
			System.out.println("Please Enter 6 to 20 length password");
			pass();
		}

		System.out.print("\n\nConfirm password:-");
		password2 = s.next();
		name.add(password2);

		if (username1.equals(username1) && password2.equals(password1)) {

			System.out.println("");
//        	System.out.println("LOGIN DETAILS:- "+name +phone);
		} else {
			System.out.println("\n\nRe-enter the password ");
			pass();
			// System.out.print("\n\n LOGIN DETAILS:-" + name +phone1);

		}
		System.out.print("\n\nLOGIN DETAILS:-" + name);
	}

	public void login() {
		System.out.println("\n\n|==============================================|\n"
				+ "|                 LOGIN PAGE                   |\n"
				+ "|==============================================|");

		Scanner s = new Scanner(System.in);
		System.out.print("\n\nEnter username:");// username:user
		username = s.nextLine();
		if (username.equals(username1)) 
		{
//			 System.out.print("\n\nEnter Password");
		} else {
			System.out.println("\n\nEnter valid Username");
			login();
		}
	}

	public void demo() {
		System.out.print("\n\nEnter password:-");
		password = s.next();

		if (password.equals(password2)) {
			System.out.println("\n\nLogin Successful");
		} else {
			demo();

		}

	}
}

class OS {
	public void boot() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n########################################\n\n"
				+ "%%%%%%%% ENTER OPERATING TYPE %%%%%%%%%\n\n" + "########################################"
				+ "\n\nPRESS 1 FOR WINDOWS "
				+ "\n\nPRESS 2 FOR LINUX "
				+ "\n\nPRESS 3 FOR MAC");
		
		int option = scan.nextInt();

		switch (option) {

		case 1:
			System.out.println("WINDOWS\n\n");
			Windows h1 = new Windows();
			h1.test();

			break;
		case 2:
			System.out.println("LINUX\n\n");
			Linux l1 = new Linux();
			l1.boot();
			break;
		case 3:
			System.out.println("MAC\n\n");
			Mac m2 = new Mac();
			m2.jack();
			break;

		default:
			System.out.println("Enter valid number");
			boot();
		}
	}

}

class Windows extends OS {
	public void test() {
		Scanner scan = new Scanner(System.in);
		System.out.println("/////////////////////////////////\n\n " 
								+ "ENTER WINDOW TYPE:" 
								+ "\n\n///////////////////////////////"
								+ "\n\nPRESS 1 FOR PRE-NT " 
								+ "\n\nPRESS 2 FOR POST-NT "
								+ "\n\nPRESS 3 FOR CLIENT SERVER");
		int r = scan.nextInt();		
		switch (r) {
		case 1:
			System.out.println("PRE-NT\n");
			Windows ref2 = new PRE_NT();
			ref2.test();
			break;
		case 2:
			System.out.println("POST-NT\n");
			Windows ref = new Post_NT();
			ref.test();
			break;
		case 3:
			System.out.println("CLIENT SERVER\n");
			Windows ref1 = new Client_server();
			ref1.test();
			break;
		default:
			System.out.println("Enter valid Number");
			test();
		}

	}
}

class PRE_NT extends Windows {
	public void test() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\n" + "Enter PRE-NT VERSION NO.:"
				+ "\n\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\""
				+ "\n\nPRESS 1 FOR WINDOWS 1.0 "
				+ "\nPRESS 2 FOR WINDOWS 2.0 "
				+ "\nPRESS 3 FOR WINDOWS 3.0");
		
		int option = scan.nextInt();
		Windows b = new Windows();

		switch (option) {
		case 1:
			System.out
					.println("WINDOWS 1.0 \n\n" 
							+ "Hardware Requirements\n\nVideo: CGA/HGC/EGA\n" 
							+ "DOS: MS-DOS 2.0\n"
							+ "RAM: 256 KB or more,\n" 
							+ "Disk Drive(s): 2 double-sided disk drives or hard drive.\n\n"
							+ "Windows 1.0 included programs:\n" 
							+ "\n" 
							+ "Microsoft DOS Executive\n"
							+ "Calculator\n"
							+ "Calendar\n" 
							+ "Cardfile\n" 
							+ "Clipboard\n"
							+ "Clock\n" 
							+ "Control Panel\n"
							+ "Notepad\n"
							+ "Print Spooler\n"
							+ "Reversi\n" 
							+ "Terminal\n" 
							+ "Windows Paint\n"
							+ "Windows Write");

			System.out.println("\n\nIf you have windows types press Y else N");
			char sc = scan.next().charAt(0);
			switch (sc) {
			case 'Y':
				b.test();
				break;
			case 'N':
				break;
			}
			break;
		case 2:
			System.out.println(
					"WINDOWS 2.0\n\nNew features\n" 
							+ "Overlapping windows (Windows 1.x could only tile windows)\n"
							+ "Minimization and maximization of windows.\n"
							+ "Better keyboard shortcuts\n"
							+ "Improved shell design\n" + "VGA graphics support\n" 
							+ "EMS memory support\n\n"
							+ "Application support\n"
							+ "The first Windows versions of Microsoft Word and Excel ran on Windows 2.0.\n");

			System.out.println("\n\nIf you have windows types press Y else N");
			char A = scan.next().charAt(0);
			switch (A) {
			case 'Y':
				b.test();
				break;
			case 'N':
				break;
			}
			break;
		case 3:
			System.out.println("WINDOWS 3.0\n\nSystem requirements\n"
								+ "The official system requirements for Windows 3.0x:\n" 
								+ "\n" 
								+ "8086/8088 processor or better\n"
								+ "384K of free conventional memory (real mode, protected modes require more)\n"
								+ "Hard disk with 6-7MB of free space\n"
								+ "CGA/EGA/VGA/Hercules/8514/A graphics and an appropriate and compatible monitor\n"
								+ "Microsoft DOS version 3.1 or higher\n\n\n" 
								+ "New features\n\n" 
								+ "Improved user interface\n"
								+ "Better memory management with Intel's 80286 and 80386 processors.\n"
								+ "Multiple DOS program multitasking support.\n" 
								+ "Revamped Control Panel\n"
								+ "Solitaire card game program added.\n"
								+ "Improved Paintbrush program.\n"
								+ "Improved Windows icons in EGA\\VGA mode, support for 256 color VGA. (80286 processor or better required)\n"
								+ "(Multimedia Extensions 1.x release): included a CD-ROM drive and sound card support, such as the Creative Labs Sound Blaster Pro.");

			System.out.println("\n\nIf you have window type press Y else N ");
			char B = scan.next().charAt(0);
			switch (B) {
			case 'Y':
				b.test();
				break;
			case 'N':
				break;
			}
			break;
		default:
			System.out.println("Enter valid Number");
			test();
		}

	}

}

class Post_NT extends Windows {
	public void test() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter POST-NT VERSION NO.: "
				+ "\nPRESS 1 FOR WINDOWS 4.0 "
				+ "\nPRESS 2 FOR WINDOWS 2000");
		
		int option = scan.nextInt();

		Windows a = new Windows();

		switch (option) {
		case 1:
			System.out.println(
					"WINDOWS 4.0\n\nSystem requirements\n486/25 processor or better, recommended 486DX2/50 processor or better\n"
							+ "12 MB of RAM ( 16 MB for NT Server ), 32 MB is recommended, 4 GB maximum\n"
							+ "VGA level video support\n" 
							+ "Keyboard\n" 
							+ "IDE, EIDE, SCSI, or ESDI hard disk\n"
							+ "CD-ROM drive, 1.44 MB or 1.2 MB floppy disk drive, or active network connection\n"
							+ "110 MB of free space ( 125 MB for NT Server ), 1 GB is recommended\n"
							+ "28.8 v.34 external modem, for remote debugging and troubleshooting recommended");

			System.out.println("\n\nIf you have windows types press Y else N");
			int sc = scan.next().charAt(0);
			switch (sc) {
			case 'Y':
				a.test();
				break;
			case 'N':
				break;
			}

			break;
		case 2:
			System.out.println("WINDOWS 5.0\n\nSystem Requirements and Featurs\nSVGA Monitor (*VGA monitor)\n"
					+ "Pentium II 300MHz processor or better (*Pentium 150 MHz)\n" 
					+ "64MB of RAM (*32MB)\n"
					+ "2GB free hard-disk space (*295MB)\n" + "DVD-ROM drive (*CD-ROM)\n"
					+ "DVD decoder card or software (DVD option)\n"
					+ "56.6 Kbs modem or faster with current Internet connection (Windows Movie Maker option)\n"
					+ "Pentium-compatible or equivalent TV tuner card (WebTV option)\n"
					+ "ActiveSync 3.0 or higher (Windows CE option)\n"
					+ "Windows CE 2.11 or greater (Windows CE option)\n"
					+ "Windows Media Player for Palm-sized PC (Windows CE option)\n"
					+ "CompactFlash or SmartMedia readers and media (Windows Portable Digital Device option)\n"
					+ "Good quality microphone (Windows Movie Maker option)\n"
					+ "Video capture device (Windows Movie Maker option)\n"
					+ "Sound card\n"
					+ "Speakers or headphones");

			System.out.println("\n\nIf you have windows types press Y else N");
			int A = scan.next().charAt(0);
			switch (A) {
			case 'Y':
				a.test();
				break;
			case 'N':
				break;
			}
			break;
		default:
			System.out.println("Enter valid number");
			test();
		}

	}

}

class Client_server extends Windows {
	public void test() {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"CLIENT SERVER VERSIONS\n\n"
				+ "PRESS 1 FOR WINDOWS XP "
				+ "\nPRESS 2 FOR WINDOWS VISTA"
				+ "\nPRESS 3 FOR WINDOWS 7 "
				+ "\nPRESS 4 WINDOWS 10"
				+ "\nPRESS 5 FOR WINDOWS 11");
		
		int option = scan.nextInt();
		Windows b = new Windows();

		switch (option) {
		case 1:
			System.out.println("WINDOWS XP\n\nWindows XP system requirements\n" 
							+ "233 MHz or faster processor.\n"
							+ "64 MB RAM minimum (128 MB recommended).\n" 
							+ "1.5 GB hard drive space.\n"
							+ "CD-ROM or DVD drive.\n" 
							+ "SVGA video card.\n"
							+ "100% compatible Microsoft keyboard and mouse.\n" 
							+ "Standard sound card for sound capability.\n"
							+ "Upgrade requires Windows 98, 98 SE, or ME.\n\n" 
							+ "Windows XP system requirements\n"
							+ "233 MHz or faster processor.\n" 
							+ "64 MB RAM minimum (128 MB recommended).\n"
							+ "1.5 GB hard drive space.\n" 
							+ "CD-ROM or DVD drive.\n" 
							+ "SVGA video card.\n"
							+ "100% compatible Microsoft keyboard and mouse.\n" 
							+ "Standard sound card for sound capability.\n"
							+ "Upgrade requires Windows 98, 98 SE, or ME.");

			System.out.println("\n\nIf you have windows types press Y else N");
			int sc = scan.next().charAt(0);
			
			switch (sc) {
			case 'Y':
				b.test();
				break;
			case 'N':
				break;
			}

			break;
		case 2:
			System.out.println("WINDOWS VISTA\n\nWINDOWS VISTA SYSTEM REQUIREMENT\n\n"
								+ "A modern processor (at least 800 MHz)\n" 
								+ "512 MB of system memory\n"
								+ "A graphics processor that is DirectX 9 capable\n"
								+ "20 GB of hard drive capacity with 15 GB free space\n" 
								+ "CD-ROM drive\n\n\n"
								+ "1 GHz 32-bit (x86) or 64-bit (x64) processor\n"
								+ "UITS recommends: A dual-core (Core 2) processor\n" 
								+ "1 GB of system memory\n"
								+ "UITS recommends: 2 GB system memory\n"
								+ "A graphics processor that is DirectX 9 capable with Hardware Pixel Shader v2.0 and WDDM Driver support\n"
								+ "128 MB of graphics memory\n"
								+ "UITS recommends: 256 MB graphics memory; non-integrated video card\n"
								+ "40 GB of hard drive capacity with 15 GB free space\n"
								+ "UITS recommends: 80-100 GB capacity\n"
								+ "DVD-ROM drive\n"
								+ "Audio output capability\n" 
								+ "Internet access capability");

			System.out.println("\n\nIf you have  windows types press Y else N");
			int A = scan.next().charAt(0);
			
			switch (A) {
			case 'Y':
				b.test();
				break;
			case 'N':
				break;
			}
			break;
		case 3:
			System.out.println("WINDOWS 7\n\nWINDOWS 7 SYSTEM REQUIREMENT\n\n"
					+ "1 gigahertz (GHz) or faster 32-bit (x86) or 64-bit (x64) processor*\n"
					+ "1 gigabyte (GB) RAM (32-bit) or 2 GB RAM (64-bit)\n"
					+ "16 GB available hard disk space (32-bit) or 20 GB (64-bit)\n"
					+ "DirectX 9 graphics device with WDDM 1.0 or higher driver");

			System.out.println("\n\nIf you have windows types press Y else N");
			int C = scan.next().charAt(0);
			// Operating_system c = new Window();
			switch (C) {
			case 'Y':
				b.test();
				break;
			case 'N':
				break;
			}
			break;
		case 4:
			System.out.println(
					"WINDOWS 10\n\nWINDOW 10 SYSTEM REQUIREMENT\n\nProcessor: 1 gigahertz (GHz) or faster processor or SoC\n"
							+ "RAM: 1 gigabyte (GB) for 32-bit or 2 GB for 64-bit\n"
							+ "Hard disk space: 16 GB for 32-bit OS or 20 GB for 64-bit OS\n"
							+ "Graphics card: DirectX 9 or later with WDDM 1.0 driver\n" + "Display: 800 x 600\n");

			System.out.println("If you have windows types press Y else N");
			int D = scan.next().charAt(0);
			// Operating_system d = new Window();
			switch (D) {
			case 'Y':
				b.test();
				break;
			case 'N':
				break;
			}
			break;
		case 5:
			System.out.println("WINDOWS 11\n\nWINDOW 11 SYSTEM REQUIREMENT\n\n"
								+ "Processor 1 gigahertz (GHz) or faster with 2 or more cores on a compatible 64-bit processor or System on a Chip (SoC).\n"
								+ "RAM	4 gigabyte (GB).\n" 
								+ "Storage	64 GB or larger storage device.\n"
								+ "System firmware	UEFI, Secure Boot capable..\n"
								+ "TPM	Trusted Platform Module (TPM) version 2.0.\n"
								+ "Graphics card	Compatible with DirectX 12 or later with WDDM 2.0 driver.\n"
								+ "Display	High definition (720p) display that is greater than 9” diagonally, 8 bits per color channel.");
			
			System.out.println("\n\nIf you have windows types press Y else N");
			int E = scan.next().charAt(0);
			// Operating_system e = new Window();
			switch (E) {
			case 'Y':
				b.test();
				break;
			case 'N':
				break;
			}
			break;
		default:
			System.out.println("Enter valid Number");
			test();
		}
	}

}

//Linux

class Linux extends OS {
	public void boot() {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"LINUX TYPE\n\n\nPRESS 1 FOR UBUNTU\n\nPRESS 2 FOR KALI LINUX\n\nPRESS 3 FEDORA\n\nPRESS 4 FOR X-UBUNTU\n\nPRESS 5 FOR RED HAT");
		int option = scan.nextInt();
		switch (option) {
		case 1:
			System.out.println("UBUNTU\nnUbuntu Desktop Edition\n" 
		+ " GHz dual core processor\n"
					+ " GiB RAM (system memory)\n"
					+ "25 GB (8.6 GB for minimal) of hard-drive space (or USB stick, memory card or external drive but see LiveCD for an alternative approach\n"
					+ "VGA capable of 1024x768 screen resolution\n"
					+ "Either a CD/DVD drive or a USB port for the installer media\n");

			System.out.println("\n\nIf you have Linux Types press Y else N ");
			char sc = scan.next().charAt(0);
			switch (sc) {
			case 'Y':
				boot();
				break;
			case 'N':
				break;

			}
			break;
		case 2:
			System.out.println(
					"KALI LINUX\n\n A minimum of 20GB hard disk space for installation depending on the version, Version 2020.2 requires at least 20GB.[16]\n"
							+ "A minimum of 2GB RAM for i386 and AMD64 architectures.\n"
							+ "A bootable CD-DVD drive or a USB stick.\n"
							+ "A minimum of an Intel Core i3 or an AMD E1 processor for good performance.\n"
							+ "The recommended hardware specification for a smooth experience are:\n" 
							+ "\n"
							+ "50 GB of hard disk space, SSD preferred\n" 
							+ "At least 2GB of RAM");
			
			System.out.println("\n\nIf you have Linux Types press Y else N ");
			char C = scan.next().charAt(0);
			switch (C) {
			case 'Y':
				boot();
				break;
			case 'N':
				break;

			}
			break;
		case 3:
			System.out.println("FEDORA\n\nMinimum System Configuration\n\n2GHz dual core processor or faster\n"
								+ "2GB System Memory\n" 
								+ "15GB unallocated drive space" 
								+ "2GHz dual core processor or faster\n"
								+ "2GB System Memory\n" 
								+ "15GB unallocated drive space" 
								+ "Intel prior to GMA9xx\n"
								+ "NVIDIA prior to NV30 (GeForce FX5xxx series)\n" 
								+ "Radeon prior to R300 (Radeon 9500)\n" 
								+ "");

			System.out.println("\n\nIf you have Linux Types press Y else N ");
			char A = scan.next().charAt(0);
			switch (A) {
			case 'Y':
				boot();
				break;
			case 'N':
				break;

			}

			break;
		case 4:
			System.out.println("X-UBUNTU\n\n8.6 GB hard disk space\n"
								+ "an Intel or AMD 64-bit processor\n"
								+ "1 GB of RAM\n" 
								+ "");
			
			System.out.println("\n\nIf you have Linux Types press Y else N ");
			char B = scan.next().charAt(0);
			switch (B) {
			case 'Y':
				boot();
				break;
			case 'N':
				break;

			}
			break;
		case 5:
			System.out.println(
					"RAD-HAT\n\nThe Red Hat Linux Master Server requires one of the following versions of Red Hat Linux:\n"
							+ "Red Hat Linux 7.2, 7.3, or 8.0\n" 
							+ "Red Hat Advanced Server 2.1\n"
							+ "The system must meet the following hardware requirements:\n"
							+ "1 GHz single or multiple CPU, Intel x86-compatible hardware only.\n"
							+ "At least 1 GByte RAM.\n"
							+ "2 GBytes HD free space. The repository space requirement is determined by the size of your deployed applications.");

			System.out.println("\n\nIf you have Linux Types press Y else N ");
			char F = scan.next().charAt(0);
			switch (F) {
			case 'Y':
				boot();
				break;
			case 'N':
				break;
			}
			break;
		default:
			System.out.println("Enter valid Number");
			boot();
		}

	}

}

class Mac extends OS {
					int Cheetah = 2000;
					int Puma = 3000;
					int Mojave = 4000;
					int Panther = 5000;
					int Tiger = 4000;
					int Leopard = 4000;
	
	public void jack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER MAC VERSION\n\n"
							+ "PRESS 1 Mac OS X Cheetah\n\n" 
							+ "PRESS 2 Mac OS X Puma\n\n"
							+ "PRESS 3 Mac OS X Jaguar\n\n" 
							+ "PRESS 4 Mac OS X Panther\n\n"
							+ "PRESS 5 Mac OS X Tiger\n\n"
							+ "PRESS 6 Mac OS X Leopard\n\n");
					
		int option = sc.nextInt();
		Mac M = new Mac();
		Payment N = new Payment(); 

		switch (option) {
		case 1:
			System.out.println("Mac OS X Cheetah"
					+ "RAM:\n"
					+ "128 MB (unofficially 64 MB minimum)\n"
					+ "Hard Drive Space:\n"	
					+ "1,500 MB (800 MB for the minimal install)"
					+ "\n\nSupported Computers: Power Macintosh G3 Beige," 
					+ "\nG3 B&W, G4, G4 Cube, "
					+ "\niMac G3, PowerBook G3, \n" 
					+ "PowerBook G4, iBook");
			
			System.out.println("\n\nIf you buy this OS Press 'y'\n" 
								+ "Return back MAC Types press 'Y' else 'N' ");
			char F = sc.next().charAt(0);
			switch (F) {
			case 'y':
				System.out.println("Mac Version Price " + M.Cheetah);
				N.payoption();
				System.out.println("Thanks for buy this OS");
				break;
			case 'Y':
				jack();
				break;
			case 'N':
				break;
				default:
					System.out.println("Enter valid character");
			}
			break;

		case 2:
			System.out.println("Mac OS X Puma" 
					+ "RAM:\n" 
					+ "\n"
					+ "128 megabytes (MB) (unofficially 64 MB minimum)\n"
					+ "Hard Drive Space:\n" 
					+ "\n" 
					+ "1.5 gigabytes (GB)"
					+ "\n\nSupported computers:\n" 
					+ "\n"
					+ "Power Mac G3\n" 
					+ "Power Mac G4\n" 
					+ "Power Mac G4 Cube\n"
					+ "iMac G3\n" 
					+ "eMac\n"
					+ "PowerBook G3, except for the original PowerBook G3\n"
					+ "PowerBook G4\n" 
					+ "iBook");
			
			System.out.println("\n\nIf you buy this OS Press 'y'\n" 
								+ "Return back MAC Types press Y else N ");
			char E = sc.next().charAt(0);
			switch (E) {
			case 'y':
				System.out.println("Mac Version Price " + M.Puma);
				N.payoption();
				System.out.println("Thanks for buy this OS ");
				break;
			case 'Y':
				jack();
				break;
			case 'N':
				break;
				default:
					System.out.println("Enter valid character");
			}
			break;
		case 3:
			System.out.println("Mac OS X macOS 10.14 (Mojave)\n\n" 
					+ "System Requirements\n\n" 
					+ "OS X 10.8 or later\n"
					+ "2GB of memory\n" 
					+ "12.5GB of available storage\n\n"
					+ "Feature Requirements\n\n"
					+ "Siri\n"
					+ "Dictation and Voice Memos\n" 
					+ "Spotlight Suggestions\n"
					+ "Gestures\n" 
					+ "Photo Booth\n"
					+ "FaceTime");
			
			System.out.println("\n\nIf you buy this OS Press 'y'\n " 
								+ " return back MAC Types press 'Y' else 'N' ");
			char H = sc.next().charAt(0);
			switch (H) {
			case 'y':
				System.out.println("Mac Version Price " + M.Mojave);
				N.payoption();
				System.out.println("Thanks for buy this OS ");
				break;
			case 'Y':
				jack();
				break;
			case 'N':
				break;
				default:
					System.out.println("Eneter valid character");
				
			}

			break;
		case 4:
			System.out.println(
					"Mac OS X Panther\n\n"
							+ "PowerPC G3, G4, or G5 processor (at least 233 MHz)\n" 
							+ "Built-in USB\n"
							+ "At least 128 MB of RAM (256 MB recommended, minimum of 96 MB supported unofficially)\n"
							+ "At least 1.5 GB of available hard disk space\n" 
							+ "CD drive\n\n");
			
			System.out.println("\n\nIf you buy this OS Press 'y' \n" 
								+ " return back MAC Types press Y else N ");
			char G = sc.next().charAt(0);
			switch (G) {
			case 'y':
				System.out.println("Mac Version Price " + Panther);
				N.payoption();
				System.out.println("Thanks for buy this OS ");
				break;
			case 'Y':
				jack();
				break;
			case 'N':
				break;
				default:
					System.out.println("Enter valid charater"); 
				
			}
		case 5:
			System.out.println(
					"Mac OS X Tiger\n\n"
					+ "Macintosh computer with a PowerPC G3, G4 or G5 processor\n"
					+ "Built-in FireWire\n"
					+ "DVD drive for installation\n"
					+ "256MB of RAM\n"
					+ "3GB of available hard disk space (4GB if the user installs the developer tools)");
							
			System.out.println("\n\nIf you buy this OS Press 'y' \n" 
							+ " return back MAC Types press Y else N ");
			char h = sc.next().charAt(0);
			switch (h) {
			case 'y':
				System.out.println("Mac Version Price " + Tiger);
				N.payoption();
				System.out.println("Thanks for buy this OS ");
				break;
			case 'Y':
				jack();
				break;
			case 'N':
				break;
				
				default:
					System.out.println("Enter valid charater"); 
				
			}
		case 6:
			System.out.println(
					"Mac OS X Leopard\n\n"
					+ "Processor: any Intel processor, or PowerPC G5 or G4 (867 MHz and faster) processor\n"
					+ "Optical drive: internal or external DVD drive (for installation of the operating system)\n"
					+ "Memory: minimum 512 MB of RAM (additional RAM (1 GB) is recommended for development purposes)\n"
					+ "Hard drive capacity: Minimum 9 GB of disk space available.");
			
			System.out.println("\n\nIf you buy this OS Press 'y' \n" 
								+ " return back MAC Types press Y else N ");
			char j = sc.next().charAt(0);
			switch (j) {
			case 'y':
				System.out.println("Mac Version Price " + Leopard);
				N.payoption();
				System.out.println("Thanks for buy this OS ");
				boot();
				break;
			case 'Y':
				jack();
				break;
			case 'N':
				break;
				default:
					System.out.println("Enter valid charater"); 
				
			}
			

			break;
			default:
				System.out.println("Enter valid number");
		}
	}
}

class Payment extends Mac {

	Scanner sc = new Scanner(System.in);
	Long G;

	public void payoption() {
		System.out.println("Gpay Press 1");
		int B = sc.nextInt();
		info e = new info();

		switch (B) {
		case 1: {
		
			System.out.print("Enter Gpay No. ");
			Long G = sc.nextLong();

			System.out.print("Enter UPI Pin. ");
			int H = sc.nextInt();
			break;
		}
		default:
			System.out.println("Enter valid option");
			payoption();

		}

	}
}

class Driver {
	static {

		System.out.println("\n\n\n|===================================================|\n"
				+ "|                                                   |\n"
				+ "|         WELCOME TO OPERATING SYSTEM WORLD         |\n"
				+ "|                                                   |\n"
				+ "|===================================================|");
	}

	public static void main(String[] args) {

		info i1 = new info();
		OS O1 = new OS();
		
		i1.register();
		i1.email();
		i1.pnum();
		i1.user();
		i1.pass();
		i1.login();
		i1.demo();
		O1.boot();

	}

}
