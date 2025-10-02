package au.com.woolworths.feature.product.list.legacy.compose.productfinder;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/compose/productfinder/KeyboardState;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeyboardState {
    public static final KeyboardState d;
    public static final KeyboardState e;
    public static final /* synthetic */ KeyboardState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        KeyboardState keyboardState = new KeyboardState("Opened", 0);
        d = keyboardState;
        KeyboardState keyboardState2 = new KeyboardState("Closed", 1);
        e = keyboardState2;
        KeyboardState[] keyboardStateArr = {keyboardState, keyboardState2};
        f = keyboardStateArr;
        g = EnumEntriesKt.a(keyboardStateArr);
    }

    public static KeyboardState valueOf(String str) {
        return (KeyboardState) Enum.valueOf(KeyboardState.class, str);
    }

    public static KeyboardState[] values() {
        return (KeyboardState[]) f.clone();
    }
}
