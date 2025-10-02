package au.com.woolworths.android.onesite.featuretoggles;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/FirebaseRepositoryImpl;", "Lau/com/woolworths/android/onesite/featuretoggles/FirebaseRepository;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FirebaseRepositoryImpl implements FirebaseRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4257a;

    public FirebaseRepositoryImpl(SharedPreferences sharedPreferences) {
        this.f4257a = sharedPreferences;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FirebaseRepository
    public final void a(long j) {
        SharedPreferences.Editor editorEdit = this.f4257a.edit();
        editorEdit.putLong("saved_app_version", j);
        editorEdit.apply();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FirebaseRepository
    public final long b() {
        return this.f4257a.getLong("saved_app_version", 0L);
    }
}
