package au.com.woolworths.feature.shop.instore.navigation.featurehighlight;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog.DeviceNotSupportedDialogKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog.GenericNavigationIssuesDialogKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog.NotInStoreDialogKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.LanguageUnavailableDialogKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.NoPermissionDialogKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.NoSupportedLanguageDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ a(Function0 function0, Modifier modifier, Function0 function02, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.f = modifier;
        this.g = function02;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                MapFeatureHighlightKt.b(RecomposeScopeImplKt.a(this.h | 1), composer, this.f, this.e, this.g);
                break;
            case 1:
                DeviceNotSupportedDialogKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.f, this.e, this.g);
                break;
            case 2:
                GenericNavigationIssuesDialogKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.f, this.e, this.g);
                break;
            case 3:
                NotInStoreDialogKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.f, this.e, this.g);
                break;
            case 4:
                LanguageUnavailableDialogKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.f, this.e, this.g);
                break;
            case 5:
                NoPermissionDialogKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.f, this.e, this.g);
                break;
            case 6:
                NoSupportedLanguageDialogKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.f, this.e, this.g);
                break;
            default:
                au.com.woolworths.shop.lists.ui.snapalist.dialog.NoPermissionDialogKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.f, this.e, this.g);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Function0 function0, Function0 function02, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.g = function02;
        this.f = modifier;
        this.h = i;
    }
}
