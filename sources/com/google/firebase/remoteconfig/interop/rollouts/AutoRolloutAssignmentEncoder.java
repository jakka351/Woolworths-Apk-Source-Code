package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

/* loaded from: classes6.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoRolloutAssignmentEncoder f15779a = new AutoRolloutAssignmentEncoder();

    public static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {

        /* renamed from: a, reason: collision with root package name */
        public static final RolloutAssignmentEncoder f15780a = new RolloutAssignmentEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("rolloutId");
        public static final FieldDescriptor c = FieldDescriptor.b("variantId");
        public static final FieldDescriptor d = FieldDescriptor.b("parameterKey");
        public static final FieldDescriptor e = FieldDescriptor.b("parameterValue");
        public static final FieldDescriptor f = FieldDescriptor.b("templateVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, rolloutAssignment.d());
            objectEncoderContext.add(c, rolloutAssignment.f());
            objectEncoderContext.add(d, rolloutAssignment.b());
            objectEncoderContext.add(e, rolloutAssignment.c());
            objectEncoderContext.add(f, rolloutAssignment.e());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.f15780a;
        encoderConfig.registerEncoder(RolloutAssignment.class, rolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}
