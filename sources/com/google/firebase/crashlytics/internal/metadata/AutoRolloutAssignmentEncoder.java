package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

/* loaded from: classes6.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoRolloutAssignmentEncoder f15287a = new AutoRolloutAssignmentEncoder();

    public static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {

        /* renamed from: a, reason: collision with root package name */
        public static final RolloutAssignmentEncoder f15288a = new RolloutAssignmentEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("rolloutId");
        public static final FieldDescriptor c = FieldDescriptor.b("parameterKey");
        public static final FieldDescriptor d = FieldDescriptor.b("parameterValue");
        public static final FieldDescriptor e = FieldDescriptor.b("variantId");
        public static final FieldDescriptor f = FieldDescriptor.b("templateVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, rolloutAssignment.e());
            objectEncoderContext.add(c, rolloutAssignment.c());
            objectEncoderContext.add(d, rolloutAssignment.d());
            objectEncoderContext.add(e, rolloutAssignment.g());
            objectEncoderContext.add(f, rolloutAssignment.f());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.f15288a;
        encoderConfig.registerEncoder(RolloutAssignment.class, rolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}
