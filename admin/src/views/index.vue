<template>
	<el-container>
		<index-header></index-header>
		<el-container>
			<index-aside></index-aside>
			<index-main></index-main>
		</el-container>
	</el-container>
</template>
<script>
// 调用了三个组件 分别代表头部 旁边 中间
	import IndexHeader from '@/components/index/IndexHeader'
	import IndexAside from '@/components/index/IndexAsideStatic'
	import IndexMain from '@/components/index/IndexMain'
	export default {
		components: {
			IndexHeader,
			IndexAside,
			IndexMain
		}
	}
</script>

<style lang="scss" scoped>
	// 铺满全屏
	.el-container {
		position: absolute;
		width: 100%;
		top: 0;
		left: 0;
		bottom: 0;
	}
</style>
