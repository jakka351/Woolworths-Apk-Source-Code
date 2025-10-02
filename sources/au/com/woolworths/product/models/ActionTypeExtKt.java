package au.com.woolworths.product.models;

import au.com.woolworths.shop.graphql.type.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/sdui/model/action/ActionType;", "Lau/com/woolworths/shop/graphql/type/ActionType;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActionTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                ActionType.Companion companion = ActionType.e;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionType.Companion companion2 = ActionType.e;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final au.com.woolworths.sdui.model.action.ActionType toUiModel(@NotNull ActionType actionType) {
        Intrinsics.h(actionType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()];
        return i != 1 ? i != 2 ? au.com.woolworths.sdui.model.action.ActionType.e : au.com.woolworths.sdui.model.action.ActionType.e : au.com.woolworths.sdui.model.action.ActionType.d;
    }
}
