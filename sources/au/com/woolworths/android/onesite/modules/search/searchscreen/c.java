package au.com.woolworths.android.onesite.modules.search.searchscreen;

import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchContract;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Consumer, Function {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ c(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = this.d;
        Function1 function1 = this.e;
        switch (i) {
            case 0:
                int i2 = SearchActivity.R;
                ((a) function1).invoke(obj);
                break;
            case 4:
                ((j) function1).invoke(obj);
                break;
            default:
                ((k) function1).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object p0) {
        switch (this.d) {
            case 1:
                k kVar = (k) this.e;
                Intrinsics.h(p0, "p0");
                return (SearchContract.ViewState) kVar.invoke(p0);
            case 2:
                j jVar = (j) this.e;
                Intrinsics.h(p0, "p0");
                return (SearchContract.ViewState) jVar.invoke(p0);
            case 3:
                j jVar2 = (j) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) jVar2.invoke(p0);
            case 4:
            case 6:
            default:
                androidx.navigation.a aVar = (androidx.navigation.a) this.e;
                Intrinsics.h(p0, "p0");
                return (List) aVar.invoke(p0);
            case 5:
                k kVar2 = (k) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) kVar2.invoke(p0);
            case 7:
                k kVar3 = (k) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) kVar3.invoke(p0);
        }
    }
}
