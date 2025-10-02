package au.com.woolworths.shop.lists.ui.details.interactor;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractorImpl", f = "ListDetailsInteractor.kt", l = {38}, m = "listDetails")
/* loaded from: classes4.dex */
final class ListDetailsInteractorImpl$listDetails$1 extends ContinuationImpl {
    public String p;
    public ArrayList q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ListDetailsInteractorImpl s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListDetailsInteractorImpl$listDetails$1(ListDetailsInteractorImpl listDetailsInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = listDetailsInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, null, null, this);
    }
}
