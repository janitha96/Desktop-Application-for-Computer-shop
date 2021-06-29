/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Isuru Sampath
 */
public class Data {

    public static String[][] customerData() {
        String customer[][] = new String[][]{
            {"921602308v", "Isuru Sampath", "449/1A Makola North Makola", "0758990184"},
            {"875931962v", "Thilini Prasadika", "235/B, Godagama, Colombo", "0602810962"},
            {"868521342v", "Nalika Fernado", "456/2, Kadugala, Kandy", "0612583562"},
            {"865435456v", "Sagarika samanmali", "45/2, Panagama", "0716276123"},
            {"465688967v", "sumeda Ranasinhe", "45/9, Panadura rd, Panadura", "0312249654"},
            {"783695245v", "Kamal De zoysa", "88/F, Himiduma, Colombo", "0315554454"},
            {"921602325v", "Bandara Athauda", "123,Galle Road ,Rathmalana", "0782674530"},
            {"865435200v", "Ruwan De silva", "40,Chilaw Road,Madampe", "0112945840"},
            {"848521345v", "Ajith Kumara", "11,Kandy Road,Katugasthota", "0754576890"},
            {"907243230v", "Sumithra Malkanthi", "No 231,Bowala,Kandy", "0712324170"}};

        return customer;
    }

    public static String[][] supplierData() {
        String supplier[][] = new String[][]{
            {"", "", "201 Shanti Villa Silkhouse Street KANDY", "0725774496"},
            {"", "", "35 rosmid,colombo 7", "0778436334"},
            {"", "", "100 negombo road,kandana", "0723282194"},
            {"", "", "galle road,morauuva", "776224644"},
            {"", "", "No 65,Amunugama,Gampaha", "0779743526"},
            {"", "", "No 32,Near the school", "0711122001"},
            {"", "", "Samarasiri,Kosgolla,Kandy", "0757808498"},
            {"", "", "No 231,Bowala,Kandy", "0771520466"},
            {"", "", "No 789,Pitikanda Rd", "0713017840"},
            {"", "", "No.128,Gall Rd,Colombo", "0712493168"},};

        return supplier;

    }

    public static String[] categoryData() {
        String category[] = new String[]{
            "Processor",
            "RAM",
            "VGA",
            "Keyboard",
            "Mouse",
            "Powersupply",
            "ROM",
            "Cassing",
            "HardDisk",
            "Motherboard",
            "Laptop",
            "PC",
            "Monitor"};

        return category;
    }

    public static String[][] featuresData() {
        String features[][] = new String[][]{
            {"Brand", "Type", "model No", "cash", "Speed", "Shoket Type", "Generation", "Warrenty"},
            {"Brand", "Model", "Capacity", "Type", "Speed", "Warrenty"},
            {"Brand", "Model", "capacity", "DDR", "Warrenty"},
            {"Brand", "KeyBoard Type", "Port Type", "model", "Warrenty"},
            {"Brand", "Mouse Type", "Port Type", "model", "Warrenty"},
            {"Brand", "Model", "Watte", "Warrenty"},
            {"Brand", "Ex", "Port Type", "Speed", "Rom Type", "Model", "Warrenty"},
            {"", "", "", "", "Warrenty"},
            {"Brand", "Type", "Capacity", "Port Type", "Speed", "Model", "Warrenty"},
            {"Brand", "Model", "Type", "Soket type", "Processors", "gen", "Warrenty"},
            {"Brand", "Model", "Processor", "RAM", "HDD", "Optical Drive", "Options", "Screen", "Warrenty"},
            {"Brand", "Model", "Processor", "RAM", "HDD", "Optical Drive", "Options", "Warrenty"},
            {"Brand", "Model", "Size", "Type"}};
        return features;
    }

    public static String[][] processorDetails() {
        String processor[][] = new String[][]{
            {"", "Intel", "core i3", "4130", "3M Cache", "3.4 GHZ", "LGA 1150", "4th Gen", "8550", "2 Years"},
            {"", "Intel", "corei3", "6100", "", "3.7 GHZ", "LGA 1151", "6th Gen Skylake", "9300", "2 Years"},
            {"", "Intel", "corei5", "4440s", "6M Cache", "2.8/3.3 GHZ", "LGA 1150", "4th Gen", "13900", "2 Years",},
            {"", "Intel", "core i5", "6600", "", "3.90 GHZ", "LGA 1151", "6th Gen Skylake", "18100", "2 Years"},
            {"", "Intel", "core i5", "6600k", "", "3.50/3.9 GHZ", "LGA 1151", "6th Gen Skylake", "19900", "2 Years"},
            {"", "Intel", "core i7", "4790", "8M Cache", "3.50/3.9 GHZ", "LGA 1150", "4th Gen", "22500", "2 Years"},
            {"", "Intel", "core i7", "4790k", "8M Cache", "4/4.4 GHZ", "LGA 1150", "4th Gen", "25200", "2 Years"},
            {"", "Intel", "core i7", "6700", "8M Cache", "3.4/4 GHZ", "LGA 1151", "6th Gen Skylake", "25050", "2 Years"},
            {"", "Intel", "core i7", "6700", "8M Cache", "4/4.2 GHZ", "LGA 1151", "6th Gen Skylake", "27900", "2 Years"},};

        return processor;
    }

    public static String[][] ramDetails() {
        String ram[][] = new String[][]{
            {"", "Corsair", "ValueSelect", "16 GB", "DDR4", "2133 MHZ", "5700", "2 Years"},
            {"", "Corsair", "ValueSelect", "4 GB", "DDR4", "2133 MHZ", "1900", "2 Years"},
            {"", "Corsair", "ValueSelect", "8 GB", "DDR4", "2133 MHZ", "2950", "2 Years"},
            {"", "Corsair", "Vengeance", "16 GB", "DDR4", "2400 MHZ", "6100", "2 Years"},
            {"", "Corsair", "Vengeance", "16 GB", "DDR4", "3000 MHZ", "6900", "2 Years"},
            {"", "Corsair", "Vengeance", "8 GB", "DDR4", "2400 MHZ", "3100", "2 Years"},
            {"", "Corsair", "Vengeance", "4 GB", "DDR3", "1600 MHZ", "1950", "2 Years"},
            {"", "Corsair", "Vengeance", "8 GB", "DDR3", "1600 MHZ", "3100", "2 Years"},
            {"", "Kingston", "", "2 GB", "DDR3", "1333 MHZ", "1650", "2 Years"},
            {"", "Kingston", "Hiper x Fury", "8 GB", "DDR3", "1600 MHZ", "3100", "2 Years"},
            {"", "Kingston", "ValueRam", "2 GB", "DDR3", "1066 MHZ", "1650", "2 Years"},
            {"", "Kingston", "ValueRam", "4 GB", "DDR3", "1600 MHZ", "1700", "2 Years"},
            {"", "Kingston", "ValueRam", "8 GB", "DDR3", "1600 MHZ", "2900", "2 Years"},
            {"", "Transcend", "", "2 GB", "DDR3", "1333 MHZ", "1150", "2 Years"},
            {"", "Transcend", "", "4 GB", "DDR3", "1333 MHZ", "1700", "2 Years"},
            {"", "Transcend", "", "8 GB", "DDR3", "1333 MHZ", "2900", "2 Years"},
            {"", "Transcend", "", "8 GB", "DDR3", "1600 MHZ", "2800", "2 Years"},
            {"", "Transcend", "", "2 GB", "DDR2", "667 MHZ", "1900", "2 Years"},
            {"", "Transcend", "", "1 GB", "DDR2", "800 MHZ", "1250", "2 Years"},
            {"", "Transcend", "", "2 GB", "DDR2", "800 MHZ", "1900", "2 Years"},};

        return ram;
    }

    public static String[][] vgaDetails() {
        String vga[][] = new String[][]{
            {"", "Asus", "Nvidia Geforce 210", "1 GB", "DDR 3", "2500", "2 Years"},
            {"", "Asus", "Nvidia Geforce GT-720", "2 GB", "DDR 3", "4875", "2 Years"},
            {"", "Asus", "Nvidia Geforce GT-730", "2 GB", "DDR 3", "5530", "2 Years"},
            {"", "Asus", "Nvidia Geforce GT-730", "4 GB", "DDR 3", "7750", "2 Years"},
            {"", "Asus", "Nvidia Geforce GT-740", "2 GB", "DDR 3", "8180", "2 Years"},
            {"", "Asus", "Nvidia Geforce GTX-750", "1 GB", "DDR 5", "10090", "2 Years"},
            {"", "Asus", "Nvidia Geforce GTX-750TI", "2 GB", "DDR 5", "12260", "2 Years"},
            {"", "Asus", "Nvidia Geforce GTX-750TI-OC", "2 GB", "DDR 5", "11800", "2 Years"},
            {"", "Asus", "Nvidia Geforce GTX-970", "2 GB", "DDR 5", "21750", "2 Years"},
            {"", "Asus", "Nvidia GT-730", "2 GB", "DDR 5", "6725", "2 Years"},
            {"", "Asus", "Nvidia GT-740-OC", "2 GB", "DDR 5", "8720", "2 Years"},
            {"", "Asus", "Nvidia GTX TITANX ", "12 GB", "DDR 5", "96600", "2 Years"},
            {"", "Asus", "Nvidia GTX750-PHOC ", "2 GB", "DDR 5", "10400", "2 Years"},
            {"", "Asus", "Nvidia STRIX GTX750TI-OC ", "2 GB", "DDR 5", "12995", "2 Years"},
            {"", "Asus", "Nvidia STRIX GTX950", "2 GB", "DDR 5", "15590", "2 Years"},
            {"", "Asus", "Nvidia STRIX GTX980TI", "6 GB", "DDR 5", "62000", "2 Years"},
            {"", "Asus", "Nvidia STRIX GTX750TI-DC2OC", "4 GB", "DDR 5", "15790", "2 Years"},
            {"", "Asus", "Nvidia STRIX GTX960-DC2OC", "2 GB", "DDR 5", "17900", "2 Years"},
            {"", "Asus", "Nvidia STRIX GTX960-DC2OC", "4 GB", "DDR 5", "19780", "2 Years"},
            {"", "Asus", "Nvidia STRIX GTX980-DC2OC", "4 GB", "DDR 5", "48735", "2 Years"},
            {"", "XFX", "Nvidia Geforce GT220", "1 GB", "DDR 2", "2775", "2 Years"},
            {"", "Zotac", "Nvidia Geforce 210", "1 GB", "DDR 3", "2300", "2 Years"},
            {"", "Zotac", "Nvidia Geforce GT610", "1 GB", "DDR 3", "3000", "2 Years"},
            {"", "Zotac", "Nvidia Geforce GT610", "2 GB", "DDR 3", "3710", "2 Years"},
            {"", "Zotac", "Nvidia Geforce GT620", "1 GB", "DDR 3", "4530", "2 Years"},
            {"", "Zotac", "Nvidia Geforce GT620", "2 GB", "DDR 3", "4995", "2 Years"},
            {"", "Zotac", "Nvidia Geforce GT630", "1 GB", "DDR 3", "5100", "2 Years"},
            {"", "Zotac", "Nvidia Geforce GT630", "2 GB", "DDR 3", "5400", "2 Years"},
            {"", "Zotac", "Nvidia Geforce GT630", "4 GB", "DDR 3", "6695", "2 Years"},};

        return vga;
    }

    public static String[][] keyboardDEtails() {
        String[][] keboard = new String[][]{
            {"", "Logitech", "Classic", "USB", "MK100", "810", "6Month"},
            {"", "Logitech", "Classic", "USB", "K100", "490", " 6Month"},
            {"", "Logitech", "Gaming", "USB", "G100s", "21700", "6Month"},
            {"", "Logitech", "Gaming", "USB", "G105", "3000", "6Month"},
            {"", "Logitech", "Classic", "USB", "k120", "595", "6Month"},
            {"", "Logitech", "", "Wireless", "MK220", "1280", "6Month"},
            {"", "Logitech", "", "Wireless", "MK260r", "1650", "6Month"},
            {"", "MicroSoft", "", "USB", "ARC", "3080", "6Month"},
            {"", "MicroSoft", "", "Bluetooth", "", "3185", "6Month"},
            {"", "MicroSoft", "", "USB", "Natural Egonomic", "3620", "6Month"},
            {"", "MicroSoft", "", "Wireless", "", "1970", "6Month"},};
        return keboard;
    }

    public static String[][] mouseDetails() {
        String[][] mouse = new String[][]{
            {"", "Logitech", "Gaming", "USB", "C90", "765", "6 Month"},
            {"", "Logitech", "", "Bluetooth", "M557", "1577", "6 Month"},
            {"", "Logitech", "Gaming", "USB", "G100", "4500", "6 Month"},
            {"", "Logitech", "Gaming", "USB", "G100s", "1369", "6 Month"},
            {"", "Logitech", "Gaming", "USB", "G300", "1692", "6 Month"},
            {"", "Logitech", "Gaming", "USB", "G600", "3735", "6 Month"},
            {"", "Logitech", "Gaming", "Wireless", "C602", "4222", "6 Month"},
            {"", "Logitech", "", "USB", "100B", "410", "6 Month"},
            {"", "Logitech", "", "USB", "M105", "440", "6 Month"},
            {"", "Logitech", "", "Wireless", "M185", "769", "6 Month"},
            {"", "Logitech", "", "Wireless", "M525", "2500", "6 Month"},};
        return mouse;
    }

    public static String[][] powerSupplyDetails() {
        String[][] powerSupply = new String[][]{
            {"", "Antec", "Earth Watts Series EA 500", "500W", "4730", "1 Year"},
            {"", "Antec", "Earth Watts Series EA 650", "650W", "5000", "1 Year"},
            {"", "Antec", "Earth Watts Series EA 750", "750W", "6565", "1 Year"},
            {"", "Antec", "Earth Watts Series EA-Platinum 450", "450W", "5700", "1 Year"},
            {"", "Antec", "Earth Watts Series EA-Platinum 550", "450W", "6250", "1 Year"},
            {"", "Antec", "High Current Gamer 520", "520W", "4950", "1 Year"},
            {"", "Antec", "High Current Gamer 620", "620W", "5700", "1 Year"},
            {"", "Antec", "High Current Gamer 750", "750W", "7525", "1 Year"},
            {"", "Antec", "High Current Gamer 900", "900W", "9000", "1 Year"},
            {"", "Antec", "True Power Series TP-550", "550W", "4935", "1 Year"},
            {"", "Antec", "True Power Series TP-650", "650W", "5925", "1 Year"},
            {"", "Antec", "True Power  Quattor 1200", "1200W", "14190", "1 Year"},
            {"", "Antec", "VP 450P", "450W", "2750", "1 Year"},
            {"", "Antec", "VP 550P", "550W", "3685", "1 Year"},
            {"", "Antec", "VP 650P", "650W", "4585", "1 Year"},
            {"", "Corsair", "Bulder Series CX430", "430W", "3390", "1 Year"},
            {"", "Corsair", "Bulder Series CX430", "430W", "3390", "1 Year"},
            {"", "Corsair", "Bulder Series CX500", "500W", "4100", "1 Year"},
            {"", "Corsair", "Bulder Series CX600", "600W", "4830", "1 Year"},
            {"", "Corsair", "VS 450", "450W", "2650", "1 Year"},
            {"", "Corsair", "TX950", "950W", "11375", "1 Year"},};
        return powerSupply;
    }

    public static String[][] romDetails() {
        String rom[][] = new String[][]{
            {"", "Asus", "External", "USB", "", "DVD/RW", "", "1850", "1 Year"},
            {"", "Asus", "External", "USB", "", "Blu-ray/RW", "", "8590", "1 Year"},
            {"", "Asus", "Internal", "SATA", "", "DVD/RW", "", "1220", "1 Year"},
            {"", "Asus", "Internal", "SATA", "16X", "Blu-ray/ DVD RW", "", "7400", "1 Year"},
            {"", "LG", "Internal", "SATA", "", "DVD/RW", "", "990", "1 Year"},
            {"", "Transend", "External", "USB", "8X", "DVD/RW", "", "1700", "1 Year"},};
        return rom;
    }

    public static String[][] harddiskDetails() {
        String harddisk[][] = new String[][]{
            {"", "Segate", "HD", "1 TB", "SATA", "", "", "3700", "2 Year"},
            {"", "Segate", "HD", "160 GB", "IDE", "", "", "1550", "2 Year"},
            {"", "Segate", "HD", "2 TB", "SATA", "7200 RPM", "Barracuda", "5800", "2 Year"},
            {"", "WD", "HD", "1 TB", "SATA", "7200 RPM", "", "5984", "2 Year"},
            {"", "WD", "HD", "2 TB", "SATA", "7200 RPM", "", "9917", "2 Year"},
            {"", "WD", "HD", "4 TB", "SATA", "7200 RPM", "", "16247", "2 Year"},
            {"", "WD", "HD", "2 TB", "SATA", "5400 RPM", "", "5561", "2 Year"},
            {"", "WD", "HD", "3 TB", "SATA", "5400 RPM", "", "7436", "2 Year"},
            {"", "WD", "HD", "4 TB", "SATA", "5400 RPM", "", "10263", "2 Year"},
            {"", "WD", "HD", "1 TB", "SATA", "7200 RPM", "", "3658", "2 Year"},
            {"", "WD", "HD", "6 TB", "SATA", "5400 RPM", "", "19663", "2 Year"},
            {"", "WD", "HD", "8 TB", "SATA", "5400 RPM", "", "28600", "2 Year"},};
        return harddisk;
    }

    public String[][] motherboardDetails() {
        String[][] motherboard = new String[][]{
            {"", "Asus", "B85M", "LGA 1150", "", "4th Gen", "6105", "3 Year"},};
        return motherboard;
    }

    public static String[][] LaptopDEtails() {
        String[][] laptop = new String[][]{
            {"HP 15 - AF025AU", " AMD E1 - 6015 1.04GHz", "2GB DDR3", "500GB", "DVD/RW+DL", "Wifi/CR/BT", "15.6 LED", "256MB AMD R2", "43000"},
            {"HP 14 - R217TU", "Intel Pentium 2.66GHz (N3540)", "2GB DDR3", "500GB", "DVD/RW+DL", "Wifi/CR/BT", "14 LED", "Intel HD Graphics", "47000.00", "2 Year"},
            {"HP 250 G4 i3", "Intel Core i3 2.0GHz (5005U)", "4GB DDR3", "500GB", "DVD/RW+DL", "Wifi/CR/BT", "15.6 LED", "Intel HD Graphics", "58000.00", "2 Year"},
            {"HP 15 - AY013TX", "Intel Core i3 2.30GHz (6100U)", "4GB DDR3", "1TB", "DVD/RW+DL", "Wifi/CR/BT", "15.6 LED", "2GB AMD R5 M430", "69000.00", "2 Year"},
            {"HP Pavilion 15 - AB203TU i3", "Intel Core i3 2.30GHz (6100U)", "4GB DDR3", "1TB", "DVD/RW+DL", "Wifi/CR/BT", "15.6 LED", "Intel HD Graphics", "69,000.00"},
            {"HP Probook 440 - G3 i3", "Intel Core i3 2.30GHz (6100U)", "4GB DDR3", "500GB", "Optional", "Wifi/CR/BT/FP", "14 LED Anti-Glare", "Intel HD Graphics", "84000.00"},
            {"HP Probook 450 - G3 i3", "Intel Core i3 2.30GHz (6100U)", "4GB DDR3", "500GB", "DVD/RW+DL", "Wifi/CR/BT/FP", "15.6 LED Anti-Gla", "rIntel HD Graphics", "65000.00"},
            {"HP Pavilion 15 - AB204TU i5", "Intel Core i5 2.3/2.8GHz (6200U)", "4GB DDR3", "1TB", "DVD/RW+DL", "Wifi/CR/BT", "	15.6 LED", " Intel HD Graphics", "84000.00"},
            {"HP Pavilion 15 - AB202TX i5", "Intel Core i5 2.3/2.8GHz (6200U)", "4GB DDR3", "1TB", "DVD/RW+DL", "Wifi/CR/BT", "	15.6 LED", " 2GB GF GT940", "90000.00"},
            {"HP Star Wars Special Edition", "Intel Core i5 2.3/2.8 GHz (6200U)", "8GB DDR3", "	1TB", "	DVD/RW+DL", "Wifi/CR/BT", "15.6 IPS FHD", "2GB GF GT940", "137500.00"},
            {"HP Probook 450 - G3 i5", "Intel Core i5 2.3/2.8GHz (6200U)", "4GB DDR3", "1TB", "	DVD/RW+DL", "Wifi/CR/BT/FP", "15.6 LED Anti-Gla", "r2GB AMD R7 M340", "93500.00"},
            {"HP Probook 440 - G3 i5", "Intel Core i5 2.3/2.8GHz (6200U)", "4GB DDR3", "1TB", "	Optional ", "Wifi/CR/BT/FP", "14 LED Anti-Glare", "Intel HD Graphics", "92500.00"},
            {"HP Pavilion 15 - AB551TX i7", "Intel Core i7 2.5/3.1GHz (6500U)", "8GB DDR3", "1TB", "DVD/RW+DL", "Wifi/CR/BT", "15.6 LED", "4GB GF GT940", "122000.00"},
            {"HP Pavilion 15-AK021TX Gaming", "Intel Core i7 2.6/3.5 GHz (6700HQ)", "8GB DDR3", "2TB", "DVD/RW+DL", "Wifi/CR/BT", "15.6 LED FHD", "4GB GF GTX950", "174,500.00"},
            {"HP Probook 440 - G3 i7", "Intel Core i7 2.5/3.1GHz (6500U)", "8GB DDR3", "1TB", "Optional", " Wifi/CR/BT/FP", "14 LED Anti-Glare", "Intel HD Graphics", "123500.00"},
            {"HP Probook 450 - G3 i7", "Intel Core i7 2.5/3.1GHz (6500U)", "8GB DDR3", "1TB", "	DVD/RW+DL", "Wifi/CR/BT/FP", "15.6 LED Anti-Gla", "r2GB AMD R7 M340", "125500.00"},
            {"HP Probook 450 - G3 i7", "Intel Core i7 2.5/3.1GHz (6500U)", "8GB DDR3", "1TB", "DVD/RW+DL", "Wifi/CR/BT/FP", "15.6 LED Anti-Gla", "r2GB AMD R7 M340", "150500.00"},
            {"HP Probook 470 - G3 i7", "Intel Core i7 2.5/3.1GHz (6500U)", "8GB DDR3", "128 SSD +1TB", "DVD/RW+DL", "Wifi/CR/BT/FP", "17.3 LED", " 2GB AMD R7 M340", "163500.00"},
            {"HP Elitebook 840 G3 i5", "Intel Core i5 2.3/2.8GHz (6200U)", "8GB DDR4", "1TB ", "Optional", " Wifi/CR/BT/FP", "14 LED Anti-Glare", "Intel HD Graphics", "150000.00"},
            {"HP Elitebook 820 G3 i7", "Intel Core i7 2.5/3.1GHz (6500U)", "8GB DDR4", "1TB ", "Optional", " Wifi/CR/BT/FP", "12.1 LED Anti-Glar", "Intel HD Graphics", "180000.00"},
            {"HP Envy 13 - D128TU i5", "Intel Core i5 2.3/2.8GHz (6200U)", "4GB DDR3", "256GB SSD", "Optional ", "Wifi/CR/BT", "13.3 QHD IPS", "Intel HD Graphics", "154500.00"},
            {"HP Envy 13 - D129TU i7", "Intel Core i7 2.5/3.1GHz (6500U)", "8GB DDR3", "512GB SSD", "Optional", " Wifi/CR/BT", "13.3 QHD IPS", "Intel HD Graphics", "215000.00"},
            {"HP Envy 15 - AE011TX i7", "Intel Core i7 2.4/3.0GHz (5500U)", "8GB DDR3", "1TB", "Optional", " Wifi/CR/BT", "15.6 LED Touch", "2GB GF GT940", "159000.00"},
            {"HP Envy 15 - AE130TX i7", "Intel Core i7 2.5/3.1GHz (6500U)", "8GB DDR3", "1TB", "ptional ", "Wifi/CR/BT", "15.6 FHD IPS Touc", "2GB GF GT940", "177000.00"},
            {"HP Envy 15 - AE132TX i7", "Intel Core i7 2.5/3.1GHz (6500U)", "8GB DDR3", "256 SSD +1TB", "Optional", "Wifi/CR/BT", "15.6 FHD IPS Touc", "4GB GF GTX950", "204000.00"},
            {"HP Spectra X2 12 - A032TU", "Intel M7 - 6Y75 1.2/3.1GHz (6th Gen)", "8GB DDR3", "	512GB SSD", "Optional", "Wifi/CR/BT", "12 IPS Touch", "Intel HD Graphics", "255000.00"},
            {"HP Spectra X360 13 - 4138TU", "Intel Core i7 2.5/3.1GHz (6500U)", "8GB DDR3", "256GB SSD", "Optional", "Wifi/CR/BT", "13.3 FHD Touch", "Intel HD Graphics", "230000.00"},};
        return laptop;
    }

    public String[][] monitoeDetails() {
        String[][] monitor = new String[][]{
            {"Dell", "E1916H", "18.5 Inch", "LED","","2 yers"},
            {"Dell D2015H 20 Inch LCD ","","2 yers"},
            {"HP 22vx 21.5 inch LED ","","2 yers"},
            {"HP 22es (T3M70AA) 21.5 Inch LED","","2 yers"},
            {"Samsung LS22E310HY 21.5 inch LED","","2 yers"},
            {"LG 22MP58VQ 22 Inch LED ","","2 yers"},
            {"LG 19M37A 18.5 Inch LED ","","2 yers"},
            {"Dell SE2416H 24 inch LED ","","2 yers"},
            {"AOC E2270SWN 21.5 inches Full HD LED ","","2 yers"},
            {"Dell S2216H 21.5 inch Led","","2 yers"},
            {"Dell S Series S2415H 24-Inch","","2 yers"},
            {"Samsung LS22D300HY 21.5 inch LED","","2 yers"},
            {"LG 24MP88HM 24 inch IPS Slim LED ","","2 yers"},
            {"Dell U2414H 23.8 Inch LED ","","2 yers"},
            {"Dell E2216H (21.5 inch) Full HD LED ","","2 yers"},
            {"Dell D2215h 21.5 Inch LCD","","2 yers"},
            {"LG 20M38D 19.5 inch LED","","2 yers"},
            {"AOC 15.6 inch LED Backlit LCD - e1660Sw ","","2 yers"},
            {"Acer P166HQL 15.6 Inch LED","","2 yers"},
            {"Dell S2240L 21.5 Inch LED","","2 yers"},
            {"HP 23vx 23 Inch LED ","","2 yers"},
            {"Dell E1914H 18.5 Inch LED","","2 yers"},
            {"LG 22MP67VQ 21.5 Inch LED","","2 yers"},
            {"Dell P2414H WHXV7 24 Inch ","","2 yers"},
            {"LG 23MP67HQ Full HD IPS LED ","","2 yers"},
            {"LG 24GM77 24 Inch Gaming Monitor","","2 yers"},
            {"Dell P2214H 21.5 Inch LED LCD","","2 yers"},
            {"LG 27MP77 27 Inch HD LED ","","2 yers"},
            {"AOC I2769VM 27 Inch IPS","","2 yers"},
            {"LG 22M38D 21.5 inch LED","","2 yers"},
            {"Dell U2412 24 Inch LED ","","2 yers"},
            {"Samsung S24E510C 24 Inch ","","2 yers"},
            {"AOC I2279VWHE 21.5 inch IPS ","","2 yers"},
            {"Dell E2215HV 22 Inch LED","","2 yers"},
            {"Acer E1900HQ 18.5 inch LED","","2 yers"},
            {"LG 20M38H 19.5 inch LED","","2 yers"},
            {"Samsung LS24E390HL 24 Inch LED","","2 yers"},};
        return monitor;
    }
}
