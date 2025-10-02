package au.com.woolworths.shop.product.details.data;

import au.com.woolworths.shop.graphql.type.ActionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreActionTypeMapperKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionType.Companion companion = ActionType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ActionType.Companion companion2 = ActionType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final au.com.woolworths.sdui.model.action.ActionType a(ActionType actionType) {
        int iOrdinal = actionType.ordinal();
        if (iOrdinal == 0) {
            return au.com.woolworths.sdui.model.action.ActionType.e;
        }
        if (iOrdinal == 1) {
            return au.com.woolworths.sdui.model.action.ActionType.d;
        }
        if (iOrdinal == 2) {
            return au.com.woolworths.sdui.model.action.ActionType.e;
        }
        throw new NoWhenBranchMatchedException();
    }
}
