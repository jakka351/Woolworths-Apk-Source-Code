package au.com.woolworths.shop.lists.ui.snapalist.main;

import android.os.Build;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProcessorActivity e;

    public /* synthetic */ b(ProcessorActivity processorActivity, int i) {
        this.d = i;
        this.e = processorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        ProcessorActivity processorActivity = this.e;
        switch (i) {
            case 0:
                ProcessorActivity.Companion companion = ProcessorActivity.C;
                ProcessorActivity.Companion.Extras extras = Build.VERSION.SDK_INT >= 33 ? (ProcessorActivity.Companion.Extras) processorActivity.getIntent().getParcelableExtra("EXTRAS", ProcessorActivity.Companion.Extras.class) : (ProcessorActivity.Companion.Extras) processorActivity.getIntent().getParcelableExtra("EXTRAS");
                if (extras != null) {
                    return extras;
                }
                throw new IllegalStateException("must provide required extras");
            default:
                processorActivity.finish();
                return Unit.f24250a;
        }
    }
}
