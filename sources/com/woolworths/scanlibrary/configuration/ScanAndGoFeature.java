package com.woolworths.scanlibrary.configuration;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/configuration/ScanAndGoFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ScanAndGoFeature implements Feature {
    public static final ScanAndGoFeature d;
    public static final ScanAndGoFeature e;
    public static final ScanAndGoFeature f;
    public static final ScanAndGoFeature g;
    public static final ScanAndGoFeature h;
    public static final /* synthetic */ ScanAndGoFeature[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        ScanAndGoFeature scanAndGoFeature = new ScanAndGoFeature() { // from class: com.woolworths.scanlibrary.configuration.ScanAndGoFeature.SCANANDGO_DEVICE_FINGERPRINT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_scanandgo_device_fingerprint";
            }
        };
        d = scanAndGoFeature;
        ScanAndGoFeature scanAndGoFeature2 = new ScanAndGoFeature() { // from class: com.woolworths.scanlibrary.configuration.ScanAndGoFeature.SCANANDGO_DISABLE_PAYMENT_METHODS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_disable_scanandgo_payment_methods";
            }
        };
        e = scanAndGoFeature2;
        ScanAndGoFeature scanAndGoFeature3 = new ScanAndGoFeature() { // from class: com.woolworths.scanlibrary.configuration.ScanAndGoFeature.SCANANDGO_ERROR_REFERENCE
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "enableErrorReference";
            }

            @Override // com.woolworths.scanlibrary.configuration.ScanAndGoFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        f = scanAndGoFeature3;
        ScanAndGoFeature scanAndGoFeature4 = new ScanAndGoFeature() { // from class: com.woolworths.scanlibrary.configuration.ScanAndGoFeature.SCANANDGO_GOOGLE_PAY_CARD_READER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_scanandgo_cardreader_googlepay";
            }
        };
        g = scanAndGoFeature4;
        ScanAndGoFeature scanAndGoFeature5 = new ScanAndGoFeature() { // from class: com.woolworths.scanlibrary.configuration.ScanAndGoFeature.SCANANDGO_TAPOFF_CODE128
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_scanandgo_code128";
            }
        };
        h = scanAndGoFeature5;
        ScanAndGoFeature[] scanAndGoFeatureArr = {scanAndGoFeature, scanAndGoFeature2, scanAndGoFeature3, scanAndGoFeature4, scanAndGoFeature5};
        i = scanAndGoFeatureArr;
        j = EnumEntriesKt.a(scanAndGoFeatureArr);
    }

    public static ScanAndGoFeature valueOf(String str) {
        return (ScanAndGoFeature) Enum.valueOf(ScanAndGoFeature.class, str);
    }

    public static ScanAndGoFeature[] values() {
        return (ScanAndGoFeature[]) i.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final boolean b() {
        return true;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }
}
