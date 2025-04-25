package befr.patchke.frenchdpt;

import android.util.LruCache;

public class DepartmentCache {
    private static final LruCache<String, String[]> cache = new LruCache<>(50);

    public static String[] get(String code) {
        String[] cached = cache.get(code);
        if(cached == null) {
            cached = DepartmentDatabase.getDepartment(code);
            cache.put(code, cached);
        }
        return cached;
    }
}
