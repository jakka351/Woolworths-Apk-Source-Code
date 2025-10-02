package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutAssignment;

@AutoValue
@Encodable
/* loaded from: classes6.dex */
public abstract class RolloutAssignment {

    /* renamed from: a, reason: collision with root package name */
    public static final DataEncoder f15783a;

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract RolloutAssignment a();

        public abstract Builder b(String str);

        public abstract Builder c(String str);

        public abstract Builder d(String str);

        public abstract Builder e(long j);

        public abstract Builder f(String str);
    }

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoRolloutAssignmentEncoder.f15779a.configure(jsonDataEncoderBuilder);
        f15783a = jsonDataEncoderBuilder.a();
    }

    public static Builder a() {
        return new AutoValue_RolloutAssignment.Builder();
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract long e();

    public abstract String f();
}
