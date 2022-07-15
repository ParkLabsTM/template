package net.parklabs.common.fluid.api;

import net.minecraft.core.Rotations;
import net.parklabs.common.fluid.entity.FluidArmorStand;

public enum EulerAnglePose {
  HEAD, BODY, LEFT_ARM, RIGHT_ARM, LEFT_LEG, RIGHT_LEG;

  public void apply(FluidArmorStand fluidArmorStand, Rotations rotations) {
    switch (this) {
      case HEAD -> fluidArmorStand.setHeadPose(rotations);
      case BODY -> fluidArmorStand.setBodyPose(rotations);
      case LEFT_ARM -> fluidArmorStand.setLeftArmPose(rotations);
      case RIGHT_ARM -> fluidArmorStand.setRightArmPose(rotations);
      case LEFT_LEG -> fluidArmorStand.setLeftLegPose(rotations);
      case RIGHT_LEG -> fluidArmorStand.setRightLegPose(rotations);
    }
  }
}
