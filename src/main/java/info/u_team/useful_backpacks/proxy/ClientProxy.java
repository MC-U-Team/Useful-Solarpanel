package info.u_team.useful_backpacks.proxy;

import info.u_team.u_team_core.api.IModProxy;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ClientProxy extends CommonProxy implements IModProxy {

	@Override
	public void construct() {
		super.construct();
	}

	@Override
	public void setup() {
		super.setup();
	}

	@Override
	public void complete() {
		super.complete();
	}
}
