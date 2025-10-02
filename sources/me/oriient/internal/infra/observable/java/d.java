package me.oriient.internal.infra.observable.java;

/* loaded from: classes7.dex */
public final /* synthetic */ class d implements ObservableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24974a;
    public final /* synthetic */ ObservableListener b;

    public /* synthetic */ d(ObservableListener observableListener, int i) {
        this.f24974a = i;
        this.b = observableListener;
    }

    @Override // me.oriient.internal.infra.observable.java.ObservableListener
    public final void onValueChanged(Object obj) {
        switch (this.f24974a) {
            case 0:
                a.a(this.b, obj);
                break;
            default:
                b.a(this.b, obj);
                break;
        }
    }
}
