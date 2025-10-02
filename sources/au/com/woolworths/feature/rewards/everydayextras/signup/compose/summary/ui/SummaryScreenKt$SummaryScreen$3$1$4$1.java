package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SummaryScreenKt$SummaryScreen$3$1$4$1 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.receiver
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel r1 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel) r1
            kotlinx.coroutines.flow.MutableStateFlow r2 = r1.p
            kotlinx.coroutines.flow.MutableStateFlow r3 = r1.p
            java.lang.Object r4 = r2.getValue()
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState r4 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState) r4
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState$Content r4 = r4.b()
            r5 = 1
            if (r4 == 0) goto L1d
            boolean r4 = r4.f
            if (r4 != r5) goto L1d
            goto Lca
        L1d:
            java.lang.Object r4 = r2.getValue()
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState r4 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState) r4
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState$Content r4 = r4.b()
            r6 = 0
            if (r4 == 0) goto L55
            au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFeed r4 = r4.f6131a
            if (r4 == 0) goto L55
            au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContent r4 = r4.b
            java.util.List r4 = r4.b
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L4f
            java.lang.Object r8 = r4.next()
            boolean r9 = r8 instanceof au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem.CheckableTextItem
            if (r9 == 0) goto L3d
            r7.add(r8)
            goto L3d
        L4f:
            boolean r4 = r7.isEmpty()
            r4 = r4 ^ r5
            goto L56
        L55:
            r4 = r6
        L56:
            if (r4 == 0) goto L98
            java.lang.Object r4 = r2.getValue()
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState r4 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState) r4
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState$Content r4 = r4.b()
            if (r4 == 0) goto L69
            boolean r4 = r4.g
            if (r4 != r5) goto L69
            goto L6a
        L69:
            r5 = r6
        L6a:
            if (r5 == 0) goto L6d
            goto L98
        L6d:
            java.lang.Object r1 = r2.getValue()
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState r1 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState) r1
            boolean r2 = r1 instanceof au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState.Content
            if (r2 == 0) goto Lca
        L77:
            java.lang.Object r2 = r3.getValue()
            r4 = r2
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState r4 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState) r4
            r5 = r1
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState$Content r5 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState.Content) r5
            r15 = 0
            r16 = 895(0x37f, float:1.254E-42)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 1
            r14 = 0
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState$Content r4 = au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState.Content.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = r3.d(r2, r4)
            if (r2 == 0) goto L77
            goto Lca
        L98:
            java.lang.Object r2 = r2.getValue()
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState r2 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState) r2
            boolean r4 = r2 instanceof au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState.Content
            if (r4 == 0) goto Lc3
        La2:
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState r5 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState) r5
            r6 = r2
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState$Content r6 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState.Content) r6
            r16 = 0
            r17 = 991(0x3df, float:1.389E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$ViewState$Content r5 = au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.ViewState.Content.c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r4 = r3.d(r4, r5)
            if (r4 == 0) goto La2
        Lc3:
            kotlinx.coroutines.flow.SharedFlowImpl r1 = r1.n
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract$Action$SubmitWPayFramesForm r2 = au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract.Action.SubmitWPayFramesForm.f6130a
            r1.f(r2)
        Lca:
            kotlin.Unit r1 = kotlin.Unit.f24250a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.SummaryScreenKt$SummaryScreen$3$1$4$1.invoke():java.lang.Object");
    }
}
