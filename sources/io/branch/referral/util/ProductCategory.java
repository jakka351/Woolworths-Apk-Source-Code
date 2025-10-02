package io.branch.referral.util;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public enum ProductCategory {
    /* JADX INFO: Fake field, exist only in values array */
    ANIMALS_AND_PET_SUPPLIES("Animals & Pet Supplies"),
    /* JADX INFO: Fake field, exist only in values array */
    APPAREL_AND_ACCESSORIES("Apparel & Accessories"),
    /* JADX INFO: Fake field, exist only in values array */
    ARTS_AND_ENTERTAINMENT("Arts & Entertainment"),
    /* JADX INFO: Fake field, exist only in values array */
    BABY_AND_TODDLER("Baby & Toddler"),
    /* JADX INFO: Fake field, exist only in values array */
    BUSINESS_AND_INDUSTRIAL("Business & Industrial"),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERAS_AND_OPTICS("Cameras & Optics"),
    /* JADX INFO: Fake field, exist only in values array */
    ELECTRONICS("Electronics"),
    /* JADX INFO: Fake field, exist only in values array */
    FOOD_BEVERAGES_AND_TOBACCO("Food, Beverages & Tobacco"),
    /* JADX INFO: Fake field, exist only in values array */
    FURNITURE("Furniture"),
    /* JADX INFO: Fake field, exist only in values array */
    HARDWARE("Hardware"),
    /* JADX INFO: Fake field, exist only in values array */
    HEALTH_AND_BEAUTY("Health & Beauty"),
    /* JADX INFO: Fake field, exist only in values array */
    HOME_AND_GARDEN("Home & Garden"),
    /* JADX INFO: Fake field, exist only in values array */
    LUGGAGE_AND_BAGS("Luggage & Bags"),
    /* JADX INFO: Fake field, exist only in values array */
    MATURE("Mature"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA("Media"),
    /* JADX INFO: Fake field, exist only in values array */
    OFFICE_SUPPLIES("Office Supplies"),
    /* JADX INFO: Fake field, exist only in values array */
    RELIGIOUS_AND_CEREMONIAL("Religious & Ceremonial"),
    /* JADX INFO: Fake field, exist only in values array */
    SOFTWARE("Software"),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTING_GOODS("Sporting Goods"),
    /* JADX INFO: Fake field, exist only in values array */
    TOYS_AND_GAMES("Toys & Games"),
    /* JADX INFO: Fake field, exist only in values array */
    VEHICLES_AND_PARTS("Vehicles & Parts");

    public final String d;

    ProductCategory(String str) {
        this.d = str;
    }

    public static ProductCategory a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (ProductCategory productCategory : values()) {
            if (productCategory.d.equalsIgnoreCase(str)) {
                return productCategory;
            }
        }
        return null;
    }
}
