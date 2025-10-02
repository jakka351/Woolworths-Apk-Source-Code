package au.com.woolworths.feature.shop.ask.olive;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/AskOliveFeatures;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AskOliveFeatures implements Feature {
    public static final AskOliveFeatures d;
    public static final AskOliveFeatures e;
    public static final AskOliveFeatures f;
    public static final AskOliveFeatures g;
    public static final /* synthetic */ AskOliveFeatures[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        AskOliveFeatures askOliveFeatures = new AskOliveFeatures() { // from class: au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures.ASK_OLIVE_FILE_UPLOAD_ENABLED
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_ask_olive_file_upload_enabled";
            }

            @Override // au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = askOliveFeatures;
        AskOliveFeatures askOliveFeatures2 = new AskOliveFeatures() { // from class: au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures.OLIVE_ASYNC_MESSAGING
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_olive_async_messaging";
            }

            @Override // au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = askOliveFeatures2;
        AskOliveFeatures askOliveFeatures3 = new AskOliveFeatures() { // from class: au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures.END_CHAT
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_olive_end_chat";
            }

            @Override // au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        f = askOliveFeatures3;
        AskOliveFeatures askOliveFeatures4 = new AskOliveFeatures() { // from class: au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures.OLIVE_ENTRY_SEARCH_SCREEN
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_olive_entry_search_screen";
            }
        };
        g = askOliveFeatures4;
        AskOliveFeatures[] askOliveFeaturesArr = {askOliveFeatures, askOliveFeatures2, askOliveFeatures3, askOliveFeatures4};
        h = askOliveFeaturesArr;
        i = EnumEntriesKt.a(askOliveFeaturesArr);
    }

    public static AskOliveFeatures valueOf(String str) {
        return (AskOliveFeatures) Enum.valueOf(AskOliveFeatures.class, str);
    }

    public static AskOliveFeatures[] values() {
        return (AskOliveFeatures[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }
}
