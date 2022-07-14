package net.parklabs.setup;

import net.parklabs.common.fluid.entity.FluidArmorStand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Setup extends JavaPlugin {
  @Override
  public void onEnable() {
    super.onEnable();

    Bukkit.getServer().getScheduler().runTaskTimer(this, FluidArmorStand::tickAll, 0,1);
  }

  @Override
  public void onDisable() {
    super.onDisable();
  }
}
