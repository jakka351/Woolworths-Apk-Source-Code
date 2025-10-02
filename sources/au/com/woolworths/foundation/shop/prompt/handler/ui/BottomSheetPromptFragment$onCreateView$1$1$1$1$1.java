package au.com.woolworths.foundation.shop.prompt.handler.ui;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import au.com.woolworths.sdui.model.action.ActionData;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BottomSheetPromptFragment$onCreateView$1$1$1$1$1 extends FunctionReferenceImpl implements Function1<ActionData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ActionData p0 = (ActionData) obj;
        Intrinsics.h(p0, "p0");
        BottomSheetPromptFragment bottomSheetPromptFragment = (BottomSheetPromptFragment) this.receiver;
        bottomSheetPromptFragment.getClass();
        FragmentKt.a(BundleKt.a(new Pair(UrlHandler.ACTION, p0)), bottomSheetPromptFragment, "BottomSheetPromptFragment_RequestKey");
        bottomSheetPromptFragment.dismissAllowingStateLoss();
        return Unit.f24250a;
    }
}
