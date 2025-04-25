package befr.patchke.frenchdpt;

import java.util.HashMap;

public class DepartmentDatabase {
    private static final HashMap<String, String[]> DEPARTMENTS = new HashMap<>();

    static {
        DEPARTMENTS.put("01", new String[]{"Ain", "Bourg-en-Bresse"});
        DEPARTMENTS.put("02", new String[]{"Aisne", "Laon"});
        DEPARTMENTS.put("03", new String[]{"Allier", "Moulins"});
        DEPARTMENTS.put("04", new String[]{"Alpes-de-Haute-Provence", "Digne-les-Bains"});
        DEPARTMENTS.put("05", new String[]{"Hautes-Alpes", "Gap"});
        DEPARTMENTS.put("06", new String[]{"Alpes-Maritimes", "Nice"});
        DEPARTMENTS.put("07", new String[]{"Ardèche", "Privas"});
        DEPARTMENTS.put("08", new String[]{"Ardennes", "Charleville-Mézières"});
        DEPARTMENTS.put("09", new String[]{"Ariège", "Foix"});
        DEPARTMENTS.put("10", new String[]{"Aube", "Troyes"});
        DEPARTMENTS.put("11", new String[]{"Aude", "Carcassonne"});
        DEPARTMENTS.put("12", new String[]{"Aveyron", "Rodez"});
        DEPARTMENTS.put("13", new String[]{"Bouches-du-Rhône", "Marseille"});
        DEPARTMENTS.put("14", new String[]{"Calvados", "Caen"});
        DEPARTMENTS.put("15", new String[]{"Cantal", "Aurillac"});
        DEPARTMENTS.put("16", new String[]{"Charente", "Angoulême"});
        DEPARTMENTS.put("17", new String[]{"Charente-Maritime", "La Rochelle"});
        DEPARTMENTS.put("18", new String[]{"Cher", "Bourges"});
        DEPARTMENTS.put("19", new String[]{"Corrèze", "Tulle"});
        DEPARTMENTS.put("2A", new String[]{"Corse-du-Sud", "Ajaccio"});
        DEPARTMENTS.put("2B", new String[]{"Haute-Corse", "Bastia"});
        DEPARTMENTS.put("21", new String[]{"Côte-d'Or", "Dijon"});
        DEPARTMENTS.put("22", new String[]{"Côtes-d'Armor", "Saint-Brieuc"});
        DEPARTMENTS.put("23", new String[]{"Creuse", "Guéret"});
        DEPARTMENTS.put("24", new String[]{"Dordogne", "Périgueux"});
        DEPARTMENTS.put("25", new String[]{"Doubs", "Besançon"});
        DEPARTMENTS.put("26", new String[]{"Drôme", "Valence"});
        DEPARTMENTS.put("27", new String[]{"Eure", "Évreux"});
        DEPARTMENTS.put("28", new String[]{"Eure-et-Loir", "Chartres"});
        DEPARTMENTS.put("29", new String[]{"Finistère", "Quimper"});
        DEPARTMENTS.put("30", new String[]{"Gard", "Nîmes"});
        DEPARTMENTS.put("31", new String[]{"Haute-Garonne", "Toulouse"});
        DEPARTMENTS.put("32", new String[]{"Gers", "Auch"});
        DEPARTMENTS.put("33", new String[]{"Gironde", "Bordeaux"});
        DEPARTMENTS.put("34", new String[]{"Hérault", "Montpellier"});
        DEPARTMENTS.put("35", new String[]{"Ille-et-Vilaine", "Rennes"});
        DEPARTMENTS.put("36", new String[]{"Indre", "Châteauroux"});
        DEPARTMENTS.put("37", new String[]{"Indre-et-Loire", "Tours"});
        DEPARTMENTS.put("38", new String[]{"Isère", "Grenoble"});
        DEPARTMENTS.put("39", new String[]{"Jura", "Lons-le-Saunier"});
        DEPARTMENTS.put("40", new String[]{"Landes", "Mont-de-Marsan"});
        DEPARTMENTS.put("41", new String[]{"Loir-et-Cher", "Blois"});
        DEPARTMENTS.put("42", new String[]{"Loire", "Saint-Étienne"});
        DEPARTMENTS.put("43", new String[]{"Haute-Loire", "Le Puy-en-Velay"});
        DEPARTMENTS.put("44", new String[]{"Loire-Atlantique", "Nantes"});
        DEPARTMENTS.put("45", new String[]{"Loiret", "Orléans"});
        DEPARTMENTS.put("46", new String[]{"Lot", "Cahors"});
        DEPARTMENTS.put("47", new String[]{"Lot-et-Garonne", "Agen"});
        DEPARTMENTS.put("48", new String[]{"Lozère", "Mende"});
        DEPARTMENTS.put("49", new String[]{"Maine-et-Loire", "Angers"});
        DEPARTMENTS.put("50", new String[]{"Manche", "Saint-Lô"});
        DEPARTMENTS.put("51", new String[]{"Marne", "Châlons-en-Champagne"});
        DEPARTMENTS.put("52", new String[]{"Haute-Marne", "Chaumont"});
        DEPARTMENTS.put("53", new String[]{"Mayenne", "Laval"});
        DEPARTMENTS.put("54", new String[]{"Meurthe-et-Moselle", "Nancy"});
        DEPARTMENTS.put("55", new String[]{"Meuse", "Bar-le-Duc"});
        DEPARTMENTS.put("56", new String[]{"Morbihan", "Vannes"});
        DEPARTMENTS.put("57", new String[]{"Moselle", "Metz"});
        DEPARTMENTS.put("58", new String[]{"Nièvre", "Nevers"});
        DEPARTMENTS.put("59", new String[]{"Nord", "Lille"});
        DEPARTMENTS.put("60", new String[]{"Oise", "Beauvais"});
        DEPARTMENTS.put("61", new String[]{"Orne", "Alençon"});
        DEPARTMENTS.put("62", new String[]{"Pas-de-Calais", "Arras"});
        DEPARTMENTS.put("63", new String[]{"Puy-de-Dôme", "Clermont-Ferrand"});
        DEPARTMENTS.put("64", new String[]{"Pyrénées-Atlantiques", "Pau"});
        DEPARTMENTS.put("65", new String[]{"Hautes-Pyrénées", "Tarbes"});
        DEPARTMENTS.put("66", new String[]{"Pyrénées-Orientales", "Perpignan"});
        DEPARTMENTS.put("67", new String[]{"Bas-Rhin", "Strasbourg"});
        DEPARTMENTS.put("68", new String[]{"Haut-Rhin", "Colmar"});
        DEPARTMENTS.put("69", new String[]{"Rhône", "Lyon"});
        DEPARTMENTS.put("70", new String[]{"Haute-Saône", "Vesoul"});
        DEPARTMENTS.put("71", new String[]{"Saône-et-Loire", "Mâcon"});
        DEPARTMENTS.put("72", new String[]{"Sarthe", "Le Mans"});
        DEPARTMENTS.put("73", new String[]{"Savoie", "Chambéry"});
        DEPARTMENTS.put("74", new String[]{"Haute-Savoie", "Annecy"});
        DEPARTMENTS.put("75", new String[]{"Paris", "Paris"});
        DEPARTMENTS.put("76", new String[]{"Seine-Maritime", "Rouen"});
        DEPARTMENTS.put("77", new String[]{"Seine-et-Marne", "Melun"});
        DEPARTMENTS.put("78", new String[]{"Yvelines", "Versailles"});
        DEPARTMENTS.put("79", new String[]{"Deux-Sèvres", "Niort"});
        DEPARTMENTS.put("80", new String[]{"Somme", "Amiens"});
        DEPARTMENTS.put("81", new String[]{"Tarn", "Albi"});
        DEPARTMENTS.put("82", new String[]{"Tarn-et-Garonne", "Montauban"});
        DEPARTMENTS.put("83", new String[]{"Var", "Toulon"});
        DEPARTMENTS.put("84", new String[]{"Vaucluse", "Avignon"});
        DEPARTMENTS.put("85", new String[]{"Vendée", "La Roche-sur-Yon"});
        DEPARTMENTS.put("86", new String[]{"Vienne", "Poitiers"});
        DEPARTMENTS.put("87", new String[]{"Haute-Vienne", "Limoges"});
        DEPARTMENTS.put("88", new String[]{"Vosges", "Épinal"});
        DEPARTMENTS.put("89", new String[]{"Yonne", "Auxerre"});
        DEPARTMENTS.put("90", new String[]{"Territoire de Belfort", "Belfort"});
        DEPARTMENTS.put("91", new String[]{"Essonne", "Évry-Courcouronnes"});
        DEPARTMENTS.put("92", new String[]{"Hauts-de-Seine", "Nanterre"});
        DEPARTMENTS.put("93", new String[]{"Seine-Saint-Denis", "Bobigny"});
        DEPARTMENTS.put("94", new String[]{"Val-de-Marne", "Créteil"});
        DEPARTMENTS.put("95", new String[]{"Val-d'Oise", "Pontoise"});
        DEPARTMENTS.put("971", new String[]{"Guadeloupe", "Basse-Terre"});
        DEPARTMENTS.put("972", new String[]{"Martinique", "Fort-de-France"});
        DEPARTMENTS.put("973", new String[]{"Guyane", "Cayenne"});
        DEPARTMENTS.put("974", new String[]{"La Réunion", "Saint-Denis"});
        DEPARTMENTS.put("976", new String[]{"Mayotte", "Mamoudzou"});
    }

    public static String[] getDepartment(String code) {
        return DEPARTMENTS.get(code.toUpperCase());
    }
}

