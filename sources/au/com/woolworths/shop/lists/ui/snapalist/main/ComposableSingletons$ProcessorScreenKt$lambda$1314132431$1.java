package au.com.woolworths.shop.lists.ui.snapalist.main;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.lists.ui.snapalist.main.ComposableSingletons$ProcessorScreenKt$lambda$-1314132431$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProcessorScreenKt$lambda$1314132431$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/ui/snapalist/main/ComposableSingletons$ProcessorScreenKt$lambda$-1314132431$1$1", "Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$Listener;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.ui.snapalist.main.ComposableSingletons$ProcessorScreenKt$lambda$-1314132431$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProcessorContract.Listener {
        @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
        public final void P2() {
        }

        @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
        public final void Q2() {
        }

        @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
        public final void f0() {
        }

        @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
        public final void g0() {
        }

        @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
        public final void p2() {
        }

        @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
        public final void s() {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProcessorContract.ViewState viewState = new ProcessorContract.ViewState(6);
            byte[] bArr = new byte[0];
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            ProcessorScreenKt.b(viewState, bArr, anonymousClass1, (Function0) objG, composer, 3072);
        }
        return Unit.f24250a;
    }
}
