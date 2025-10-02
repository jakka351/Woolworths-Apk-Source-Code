package au.com.woolworths.feature.product.list.compose;

import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ApiDrivenButtonKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ButtonStyleApiData.values().length];
            try {
                iArr[ButtonStyleApiData.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyleApiData.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStyleApiData.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
