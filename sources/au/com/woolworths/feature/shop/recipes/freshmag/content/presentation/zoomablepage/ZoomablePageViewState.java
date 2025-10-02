package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/zoomablepage/ZoomablePageViewState;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZoomablePageViewState {
    public static final ZoomablePageViewState d;
    public static final ZoomablePageViewState e;
    public static final ZoomablePageViewState f;
    public static final /* synthetic */ ZoomablePageViewState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        ZoomablePageViewState zoomablePageViewState = new ZoomablePageViewState("LOADING", 0);
        d = zoomablePageViewState;
        ZoomablePageViewState zoomablePageViewState2 = new ZoomablePageViewState("LOADED", 1);
        e = zoomablePageViewState2;
        ZoomablePageViewState zoomablePageViewState3 = new ZoomablePageViewState("FAILED", 2);
        f = zoomablePageViewState3;
        ZoomablePageViewState[] zoomablePageViewStateArr = {zoomablePageViewState, zoomablePageViewState2, zoomablePageViewState3};
        g = zoomablePageViewStateArr;
        h = EnumEntriesKt.a(zoomablePageViewStateArr);
    }

    public static ZoomablePageViewState valueOf(String str) {
        return (ZoomablePageViewState) Enum.valueOf(ZoomablePageViewState.class, str);
    }

    public static ZoomablePageViewState[] values() {
        return (ZoomablePageViewState[]) g.clone();
    }
}
