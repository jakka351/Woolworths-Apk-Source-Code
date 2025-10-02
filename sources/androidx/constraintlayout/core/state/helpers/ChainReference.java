package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ChainReference extends HelperReference {
    public float o0;
    public final HashMap p0;
    public final HashMap q0;
    public final HashMap r0;
    public HashMap s0;
    public HashMap t0;
    public State.Chain u0;

    public ChainReference(State state, State.Helper helper) {
        super(state, helper);
        this.o0 = 0.5f;
        this.p0 = new HashMap();
        this.q0 = new HashMap();
        this.r0 = new HashMap();
        this.u0 = State.Chain.d;
    }

    public final float t(String str) {
        HashMap map = this.t0;
        return (map == null || !map.containsKey(str)) ? BitmapDescriptorFactory.HUE_RED : ((Float) this.t0.get(str)).floatValue();
    }

    public final float u(String str) {
        HashMap map = this.r0;
        return map.containsKey(str) ? ((Float) map.get(str)).floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    public final float v(String str) {
        HashMap map = this.s0;
        return (map == null || !map.containsKey(str)) ? BitmapDescriptorFactory.HUE_RED : ((Float) this.s0.get(str)).floatValue();
    }

    public final float w(String str) {
        HashMap map = this.q0;
        return map.containsKey(str) ? ((Float) map.get(str)).floatValue() : BitmapDescriptorFactory.HUE_RED;
    }
}
