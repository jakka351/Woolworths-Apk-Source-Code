package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import au.com.woolworths.dynamic.page.data.ContentListData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ContentListUiKt$PreviewContentListUi$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(null);
                composer.A(objG);
            }
            composer.l();
            ContentListData contentListData = (ContentListData) ((MutableState) objG).getD();
            composer.o(1849434622);
            Object objG2 = composer.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new androidx.navigation.compose.h(19, (byte) 0);
                composer.A(objG2);
            }
            composer.l();
            ContentListUiKt.b(contentListData, null, (Function2) objG2, composer, KyberEngine.KyberPolyBytes);
        }
        return Unit.f24250a;
    }
}
