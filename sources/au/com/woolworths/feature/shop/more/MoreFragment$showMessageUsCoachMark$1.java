package au.com.woolworths.feature.shop.more;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettingsKt;
import au.com.woolworths.base.shopapp.databinding.SimpleCoachMarkContentBinding;
import com.airbnb.epoxy.EpoxyModel;
import com.dynatrace.android.callback.Callback;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.overlay.BalloonOverlayRect;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreFragment$showMessageUsCoachMark$1", f = "MoreFragment.kt", l = {244}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class MoreFragment$showMessageUsCoachMark$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public int q;
    public final /* synthetic */ MoreFragment r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreFragment$showMessageUsCoachMark$1(MoreFragment moreFragment, Continuation continuation) {
        super(2, continuation);
        this.r = moreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoreFragment$showMessageUsCoachMark$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreFragment$showMessageUsCoachMark$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        RecyclerView.LayoutManager layoutManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.q;
        View viewU = null;
        final MoreFragment moreFragment = this.r;
        if (i2 == 0) {
            ResultKt.b(obj);
            MoreEpoxyController moreEpoxyController = moreFragment.p;
            if (moreEpoxyController == null) {
                Intrinsics.p("moreEpoxyController");
                throw null;
            }
            List listR = moreEpoxyController.getAdapter().R();
            Intrinsics.g(listR, "getCopyOfModels(...)");
            Iterator it = listR.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((EpoxyModel) it.next()) instanceof ItemMoreChatToUsBindingModel_) {
                    break;
                }
                i3++;
            }
            this.p = i3;
            this.q = 1;
            if (DelayKt.b(1500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.p;
            ResultKt.b(obj);
        }
        if (i != -1 && (layoutManager = moreFragment.I1().z.getLayoutManager()) != null) {
            viewU = layoutManager.u(i);
        }
        View view = viewU;
        if (view != null && !moreFragment.s) {
            FragmentActivity activity = moreFragment.getActivity();
            if (activity != null) {
                ViewParent parent = view.getParent();
                Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                ResText resText = new ResText(com.woolworths.R.string.message_us_coachmark_body);
                ResText resText2 = new ResText(com.woolworths.R.string.cmo_coachmark_got_it);
                Context contextRequireContext = moreFragment.requireContext();
                Intrinsics.g(contextRequireContext, "requireContext(...)");
                SimpleCoachMarkSettingsKt.a(activity, viewGroup, view, new SimpleCoachMarkSettings(null, resText, resText2, new Integer(Extensions.a(android.R.attr.textColorPrimary, contextRequireContext)), 0.5f, BalloonOverlayRect.f19023a, 16), new Function2() { // from class: au.com.woolworths.feature.shop.more.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        final Balloon balloon = (Balloon) obj3;
                        ((SimpleCoachMarkContentBinding) obj2).y.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.feature.shop.more.g
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Balloon balloon2 = balloon;
                                Callback.g(view2);
                                try {
                                    balloon2.c();
                                } finally {
                                    Callback.h();
                                }
                            }
                        });
                        androidx.constraintlayout.core.state.a.v(moreFragment.Q1().q.f8864a.f8865a, "message_us_coach_mark_key", true);
                        return Unit.f24250a;
                    }
                }, new au.com.woolworths.feature.shop.modeselector.ui.c(3), new e(moreFragment, 1), 0, 0, 448);
            }
            moreFragment.s = true;
        }
        return Unit.f24250a;
    }
}
