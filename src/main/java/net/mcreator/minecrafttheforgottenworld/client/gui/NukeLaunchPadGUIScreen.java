package net.mcreator.minecrafttheforgottenworld.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.minecrafttheforgottenworld.world.inventory.NukeLaunchPadGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class NukeLaunchPadGUIScreen extends AbstractContainerScreen<NukeLaunchPadGUIMenu> {
	private final static HashMap<String, Object> guistate = NukeLaunchPadGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox NukeLaunchPadInputX;
	EditBox NukeLaunchPadInputY;
	EditBox NukeLaunchPadInputZ;
	Button button_launch;

	public NukeLaunchPadGUIScreen(NukeLaunchPadGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 195;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("minecraft_the_forgotten_world:textures/screens/nuke_launch_pad_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		NukeLaunchPadInputX.render(guiGraphics, mouseX, mouseY, partialTicks);
		NukeLaunchPadInputY.render(guiGraphics, mouseX, mouseY, partialTicks);
		NukeLaunchPadInputZ.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (NukeLaunchPadInputX.isFocused())
			return NukeLaunchPadInputX.keyPressed(key, b, c);
		if (NukeLaunchPadInputY.isFocused())
			return NukeLaunchPadInputY.keyPressed(key, b, c);
		if (NukeLaunchPadInputZ.isFocused())
			return NukeLaunchPadInputZ.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		NukeLaunchPadInputX.tick();
		NukeLaunchPadInputY.tick();
		NukeLaunchPadInputZ.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String NukeLaunchPadInputXValue = NukeLaunchPadInputX.getValue();
		String NukeLaunchPadInputYValue = NukeLaunchPadInputY.getValue();
		String NukeLaunchPadInputZValue = NukeLaunchPadInputZ.getValue();
		super.resize(minecraft, width, height);
		NukeLaunchPadInputX.setValue(NukeLaunchPadInputXValue);
		NukeLaunchPadInputY.setValue(NukeLaunchPadInputYValue);
		NukeLaunchPadInputZ.setValue(NukeLaunchPadInputZValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.label_nuke"), 146, 35, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		NukeLaunchPadInputX = new EditBox(this.font, this.leftPos + 7, this.topPos + 17, 118, 18, Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputX")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputX").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputX").getString());
				else
					setSuggestion(null);
			}
		};
		NukeLaunchPadInputX.setSuggestion(Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputX").getString());
		NukeLaunchPadInputX.setMaxLength(32767);
		guistate.put("text:NukeLaunchPadInputX", NukeLaunchPadInputX);
		this.addWidget(this.NukeLaunchPadInputX);
		NukeLaunchPadInputY = new EditBox(this.font, this.leftPos + 7, this.topPos + 38, 118, 18, Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputY")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputY").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputY").getString());
				else
					setSuggestion(null);
			}
		};
		NukeLaunchPadInputY.setSuggestion(Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputY").getString());
		NukeLaunchPadInputY.setMaxLength(32767);
		guistate.put("text:NukeLaunchPadInputY", NukeLaunchPadInputY);
		this.addWidget(this.NukeLaunchPadInputY);
		NukeLaunchPadInputZ = new EditBox(this.font, this.leftPos + 7, this.topPos + 59, 118, 18, Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputZ")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputZ").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputZ").getString());
				else
					setSuggestion(null);
			}
		};
		NukeLaunchPadInputZ.setSuggestion(Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.NukeLaunchPadInputZ").getString());
		NukeLaunchPadInputZ.setMaxLength(32767);
		guistate.put("text:NukeLaunchPadInputZ", NukeLaunchPadInputZ);
		this.addWidget(this.NukeLaunchPadInputZ);
		button_launch = Button.builder(Component.translatable("gui.minecraft_the_forgotten_world.nuke_launch_pad_gui.button_launch"), e -> {
		}).bounds(this.leftPos + 131, this.topPos + 51, 56, 20).build();
		guistate.put("button:button_launch", button_launch);
		this.addRenderableWidget(button_launch);
	}
}
