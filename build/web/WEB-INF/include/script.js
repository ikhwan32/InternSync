document.addEventListener('DOMContentLoaded', function () {
    // Get the sidebar toggle button, sidebar, and content
    const sidebarCollapse = document.getElementById('sidebarCollapse');
    const sidebar = document.getElementById('sidebar');
    const content = document.getElementById('content');
    const toggleIcon = sidebarCollapse.querySelector('i');

    // Add click event to toggle sidebar
    sidebarCollapse.addEventListener('click', function () {
        // Toggle the sidebar's active state
        sidebar.classList.toggle('active');

        // Toggle the content's margin based on the sidebar's state
        if (sidebar.classList.contains('active')) {
            content.classList.add('sidebar-active');
        } else {
            content.classList.remove('sidebar-active');
        }

        // Toggle the icon between left and right arrows
        toggleIcon.classList.toggle('fa-angles-left');
        toggleIcon.classList.toggle('fa-angles-right');
    });

    // Handle responsiveness on window resize
    window.addEventListener('resize', function () {
        if (window.innerWidth <= 768) {
            // Collapse the sidebar by default on smaller screens
            sidebar.classList.add('active');
            content.classList.add('sidebar-active');
            toggleIcon.classList.remove('fa-angles-left');
            toggleIcon.classList.add('fa-angles-right');
        } else {
            // Expand the sidebar by default on larger screens
            sidebar.classList.remove('active');
            content.classList.remove('sidebar-active');
            toggleIcon.classList.remove('fa-angles-right');
            toggleIcon.classList.add('fa-angles-left');
        }
    });

    // Initialize sidebar state based on screen size
    if (window.innerWidth <= 768) {
        sidebar.classList.add('active');
        content.classList.add('sidebar-active');
        toggleIcon.classList.remove('fa-angles-left');
        toggleIcon.classList.add('fa-angles-right');
    }
});